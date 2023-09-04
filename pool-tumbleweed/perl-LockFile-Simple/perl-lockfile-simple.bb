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

RPM_NAME = "perl-LockFile-Simple-0.208-5.31.aarch64.rpm"
RPM_HASH = "ec0d2633e6bcc10b2fe3dc24f371d00901c482f21c5ed3026db1c201afd0e50e4fe8aaad536ac95beace57b1cfe9bfec680624b992666a10060970a8e424c158"

RPROVIDES:${PN} += "perl-LockFile--Lock \
perl-LockFile--Lock--Simple \
perl-LockFile--Manager \
perl-LockFile--Simple \
perl-LockFile-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
