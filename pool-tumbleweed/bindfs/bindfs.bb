SUMMARY = "Filesystem for mapping directories with alternate permissions"
DESCRIPTION = "bindfs is a FUSE filesystem for mounting a directory to another \
location, similarly to mount --bind. The permissions inside the \
mountpoint can be altered using various rules."
LICENSE = "GPL-2.0-or-later"

PV = "1.17.3"

RPM_NAME = "bindfs-1.17.3-1.1.aarch64.rpm"
RPM_HASH = "987224d44f339513643ae800b1d9fae90d29254c28c2a63f92261c167bae1e4b7b54a0c9b7b85d6b84ac77a78eaedf0d9ea79a8cf3dd3a0e7256d161c8739c8a"

RPROVIDES:${PN} += "bindfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3"

inherit rpm
