SUMMARY = "The X11 Protocol: Xprint extension"
DESCRIPTION = "The Print protocol headers for X11 development. \
Xprint is a portable, network-transparent printing system. \
It is no longer maintained and solely provided for ABI compatibility."
LICENSE = "X11"

PV = "1.0.5"

RPM_NAME = "printproto-devel-1.0.5-4.19.aarch64.rpm"
RPM_HASH = "4211b75b58e4c63cec5029977f7d0603a54faf20132172ef64422b5f1c9811a20f1974abb8a809bfe7d0368820b9164fb1992008fd1047d5e1a36627ede7234d"

RPROVIDES:${PN} += "pkgconfig-printproto \
printproto-devel \
xorg-x11-proto-devel-/usr/lib64/pkgconfig/printproto.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-xau"

inherit rpm
