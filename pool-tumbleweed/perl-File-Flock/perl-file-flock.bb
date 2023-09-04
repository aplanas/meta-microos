SUMMARY = "File Locking with Flock"
DESCRIPTION = "Lock files using the flock() call. If the file to be locked does not exist, \
then the file is created. If the file was created then it will be removed \
when it is unlocked assuming it's still an empty file. \
 \
Locks can be created by new'ing a *File::Flock* object. Such locks are \
automatically removed when the object goes out of scope. The *unlock()* \
method may also be used. \
 \
*lock_rename()* is used to tell File::Flock when a file has been renamed \
(and thus the internal locking data that is stored based on the filename \
should be moved to a new name). *unlock()* the new name rather than the \
original name. \
 \
Locks are released on process exit when the process that created the lock \
exits. Subprocesses that exit do not remove locks. Use forget_locks() or \
POSIX::_exit() to prevent unlocking on process exit."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2014.01"

RPM_NAME = "perl-File-Flock-2014.01-1.21.noarch.rpm"
RPM_HASH = "6c00431a59196a4dd19fbb089fd5ce7144bd21f6b1ea17647869428a281cbfe288339174b82bd1dc7db9decde113773618adccd6d14b2752ed87682c017ecc82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Flock \
perl-File--Flock--Forking \
perl-File--Flock--Subprocess \
perl-File--Flock--Subprocess--Connections \
perl-File--Flock--Subprocess--Master \
perl-File-Flock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-AnyEvent \
perl-Data--Structure--Util \
perl-File--Slurp \
perl-IO--Event \
perl-Test--SharedFork"

inherit rpm
