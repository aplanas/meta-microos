SUMMARY = "File locking with L<fcntl(2)>"
DESCRIPTION = "File locking in Perl is usually done using the 'flock' function. \
Unfortunately, this only allows locks on whole files and is often \
implemented in terms of the the flock(2) manpage system function which has \
some shortcomings (especially concerning locks on remotely mounted file \
systems) and slightly different behaviour than the fcntl(2) manpage. \
 \
Using this module file locking via the fcntl(2) manpage can be done \
(obviously, this restricts the use of the module to systems that have a the \
fcntl(2) manpage system call). Before a file (or parts of a file) can be \
locked, an object simulating a flock structure, containing information in a \
binary format to be passed to the fcntl(2) manpage for locking requests, \
must be created and its properties set. Afterwards, by calling the the \
lock() manpage method a lock can be set and removed or it can be determined \
if and which process currently holds the lock. \
 \
File::FcntlLock (or its alias File::FcntlLock::XS) uses a shared library, \
build during installation, to call the the fcntl(2) manpage system function \
directly. If this is unsuitable there are two alternatives, \
File::FcntlLock::Pure and File::FcntlLock::Inline. Both call the Perl \
'fcntl' function instead and use Perl code to assemble and disassemble the \
structure. For this at some time the (system-dependent) binary layout of \
the flock structure must have been determined via a program written in C. \
The difference between File::FcntlLock::Pure and File::FcntlLock::Inline is \
that for the former this happened when the package is installed while for \
the latter it is done each time the package is loaded (e.g., with 'use'). \
Thus, for File::FcntlLock::Inline to work a C compiler must be available. \
There are some minor differences in the functionality and the behaviour on \
passing the method for locking invalid arguments to be described below."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.22"

RPM_NAME = "perl-File-FcntlLock-0.22-1.37.aarch64.rpm"
RPM_HASH = "0303b95171d990dc8e1077583e3237d304ff86b12cf31cf71a0159a9a25e744d3b13c9d4a0f6605402fc4b0ae3aa358bc01880e9cd01375f175c3b935d84bcf4"

RPROVIDES:${PN} += "perl(File::FcntlLock) \
perl(File::FcntlLock::Core) \
perl(File::FcntlLock::Errors) \
perl(File::FcntlLock::Inline) \
perl(File::FcntlLock::Pure) \
perl(File::FcntlLock::XS) \
perl-File-FcntlLock \
perl-File-FcntlLock(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
