SUMMARY = "Simple file locking scheme"
DESCRIPTION = "This simple locking scheme is not based on any file locking system calls \
such as 'flock()' or 'lockf()' but rather relies on basic file system \
primitives and properties, such as the atomicity of the 'write()' system \
call. It is not meant to be exempt from all race conditions, especially \
over NFS. The algorithm used is described below in the *ALGORITHM* section. \
 \
It is possible to customize the locking operations to attempt locking once \
every 5 seconds for 30 times, or delete stale locks (files that are deemed \
too ancient) before attempting the locking."
LICENSE = "GPL-2.0+ | Artistic-1.0"

PV = "0.208"

RPM_NAME = "perl-LockFile-Simple-0.208-5.29.aarch64.rpm"
RPM_HASH = "fd434d378c357bcd20fe3204052f286ec84b01b743044dce0bd3c33eb7ae91265a6d0c1a5f32740ee5bba17c10acfeb5a1107cc6135bc42fb5d4507954ffc9f0"

RPROVIDES:${PN} += "perl(LockFile::Lock) \
perl(LockFile::Lock::Simple) \
perl(LockFile::Manager) \
perl(LockFile::Simple) \
perl-LockFile-Simple \
perl-LockFile-Simple(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
