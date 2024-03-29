SUMMARY = "Mounts an archive for access as a file system"
DESCRIPTION = "Archivemount is a piece of glue code between libarchive (http://code.google.com/p/libarchive/) and FUSE \
(http://fuse.sourceforge.net). It can be used to mount a (possibly compressed) archive (as in .tar.gz or \
.tar.bz2) and use it like an ordinary filesystem."
LICENSE = "LGPL-2.1-or-later & BSD-2-Clause"

PV = "0.9.1"

RPM_NAME = "archivemount-0.9.1-2.8.aarch64.rpm"
RPM_HASH = "5defeacb59f9950f0a2a17229444e5e97f4cdfec57f05f32d827348968d1d5b74eed9c424dfd61d6753d30f12a5a7ed3e5a71e6bd7d1b91038d588e820e6efde"

RPROVIDES:${PN} += "archivemount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libfuse.so.2"

inherit rpm
