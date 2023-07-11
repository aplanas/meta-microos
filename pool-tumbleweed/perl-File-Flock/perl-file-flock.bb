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

RPM_NAME = "perl-File-Flock-2014.01-1.20.noarch.rpm"
RPM_HASH = "118911db4a7b6218dcb11d75b15ce5abb132ced86afaa4164c22d6235cb01885d0a592a328a898b242ceba7be5fd8e63a21aca4856f7ec141f9ea0b58453cde2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Flock \
perl-File--Flock--Forking \
perl-File--Flock--Subprocess \
perl-File--Flock--Subprocess--Connections \
perl-File--Flock--Subprocess--Master \
perl-File-Flock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-AnyEvent \
perl-Data--Structure--Util \
perl-File--Slurp \
perl-IO--Event \
perl-Test--SharedFork"

inherit rpm
