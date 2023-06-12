SUMMARY = "Touch frame library"
DESCRIPTION = "This package provides the tree that handles the buildup and \
synchronisation of a set of simultaneous touches."
LICENSE = "LGPL-3.0-only & GPL-3.0-only"

PV = "2.5.0+bzr20160809"

RPM_NAME = "frame-2.5.0+bzr20160809-2.11.aarch64.rpm"
RPM_HASH = "b8d4948973e7b28866752b0598a10cf02e8d0e753b46068865134ebfa9afb6b088f0fdb5730d039eb64170e27f47e35713d8d0967de79a12b67ac2753dcd04df"

RPROVIDES:${PN} += "frame \
frame(aarch-64) \
frame-tools"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libframe.so.6()(64bit) \
libframe.so.6(FRAME_2.2)(64bit)"

inherit rpm
