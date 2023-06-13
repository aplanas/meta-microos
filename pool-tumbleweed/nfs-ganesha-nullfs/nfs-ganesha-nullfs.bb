SUMMARY = "'null' filesystem backend for NFS-Ganesha"
DESCRIPTION = "This package contains a Stackable FSAL shared object to \
be used with NFS-Ganesha. This is mostly a template for future (more sophisticated) stackable FSALs"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-nullfs-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "8ef6b1d2a9921624131e26b00d1d723f598d53f645e778b04415ccad9ec8e1f47e04d42a07c782eb83abeb6205a985388337868d0edcb63e90bb78a71c0121d4"

RPROVIDES:${PN} += "libfsalnull.so()(64bit) \
nfs-ganesha-nullfs \
nfs-ganesha-nullfs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libganesha_nfsd.so.3.3()(64bit) \
nfs-ganesha"

inherit rpm
