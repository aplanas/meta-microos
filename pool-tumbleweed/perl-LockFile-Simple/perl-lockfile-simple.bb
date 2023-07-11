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

RPM_NAME = "perl-LockFile-Simple-0.208-5.30.aarch64.rpm"
RPM_HASH = "967d3fe0850a2139250f8e6f492ae45584ddfd045981a4b7c31e5b2eecea83d321aefbfab920479dd4020d69bd818c7b11f2c84dbf1f60dd91206b7318e8a4df"

RPROVIDES:${PN} += "perl-LockFile--Lock \
perl-LockFile--Lock--Simple \
perl-LockFile--Manager \
perl-LockFile--Simple \
perl-LockFile-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
