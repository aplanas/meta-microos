SUMMARY = "Lightweight interface to shared memory"
DESCRIPTION = "IPC::ShareLite provides a simple interface to shared memory, allowing data \
to be efficiently communicated between processes. Your operating system \
must support SysV IPC (shared memory and semaphores) in order to use this \
module. \
 \
IPC::ShareLite provides an abstraction of the shared memory and semaphore \
facilities of SysV IPC, allowing the storage of arbitrarily large data; the \
module automatically acquires and removes shared memory segments as needed. \
Storage and retrieval of data is atomic, and locking functions are provided \
for higher-level synchronization. \
 \
In many respects, this module is similar to IPC::Shareable. However, \
IPC::ShareLite does not provide a tied interface, does not (automatically) \
allow the storage of variables, and is written in C for additional speed. \
 \
Construct an IPC::ShareLite object by calling its constructor: \
 \
    my $share = IPC::ShareLite->new( \
        -key     => 1971, \
        -create  => 'yes', \
        -destroy => 'no' \
    ) or die $!; \
 \
Once an instance has been created, data can be written to shared memory by \
calling the store() method: \
 \
	$share->store('This is going in shared memory'); \
 \
Retrieve the data by calling the fetch() method: \
 \
	my $str = $share->fetch(); \
 \
The store() and fetch() methods are atomic; any processes attempting to \
read or write to the memory are blocked until these calls finish. However, \
in certain situations, you'll want to perform multiple operations \
atomically. Advisory locking methods are available for this purpose. \
 \
An exclusive lock is obtained by calling the lock() method: \
 \
	$share->lock(); \
 \
Happily, the lock() method also accepts all of the flags recognized by the \
flock() system call. So, for example, you can obtain a shared lock like \
this: \
 \
	$share->lock( LOCK_SH ); \
 \
Or, you can make either type of lock non-blocking: \
 \
	$share->lock( LOCK_EX|LOCK_NB ); \
 \
Release the lock by calling the unlock() method: \
 \
	$share->unlock;"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-IPC-ShareLite-0.17-1.40.aarch64.rpm"
RPM_HASH = "2f0bffacc55db5f3f9e8d39c621133fdfd8ae95edede11db59e24302cd8bf0eef6dd6ec820dae7498e83c878fe6203d2b1555d2de189b5067e0bf5cdf9f534d5"

RPROVIDES:${PN} += "perl-IPC--ShareLite \
perl-IPC-ShareLite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
