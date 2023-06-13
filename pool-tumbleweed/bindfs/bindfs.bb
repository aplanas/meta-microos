SUMMARY = "Filesystem for mapping directories with alternate permissions"
DESCRIPTION = "bindfs is a FUSE filesystem for mounting a directory to another \
location, similarly to mount --bind. The permissions inside the \
mountpoint can be altered using various rules."
LICENSE = "GPL-2.0-or-later"

PV = "1.17.2"

RPM_NAME = "bindfs-1.17.2-1.2.aarch64.rpm"
RPM_HASH = "08814d32a72dedbbc8b6d41767d05676a7dadf1662e375bf6a03a94f29d531dce1d9485fbdda1ce1de901c561156b1e998d32b5651f7459394147bc6fb433e2e"

RPROVIDES:${PN} += "bindfs \
bindfs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse3.so.3()(64bit) \
libfuse3.so.3(FUSE_3.0)(64bit)"

inherit rpm
