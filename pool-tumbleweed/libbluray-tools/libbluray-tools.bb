SUMMARY = "Library to access Blu-Ray disk - Utilities"
DESCRIPTION = "This library is written for the purpose of playing Blu-ray movies. It is \
intended for software that want to support Blu-ray playback (such as VLC and \
MPlayer). We, the authors of this library, do not condone nor endorse piracy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.4"

RPM_NAME = "libbluray-tools-1.3.4-1.3.aarch64.rpm"
RPM_HASH = "7e0dc3f68a4616a58c3f952220251286419ef27032e4d0a8098f50ac1c107b1184f5b79b4330b42831a23cea01b5fd78d104ab93fd58e419dd340c6056de6730"

RPROVIDES:${PN} += "libbluray-tools \
libbluray-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbluray.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
