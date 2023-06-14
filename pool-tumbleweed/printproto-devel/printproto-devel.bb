SUMMARY = "The X11 Protocol: Xprint extension"
DESCRIPTION = "The Print protocol headers for X11 development. \
Xprint is a portable, network-transparent printing system. \
It is no longer maintained and solely provided for ABI compatibility."
LICENSE = "X11"

PV = "1.0.5"

RPM_NAME = "printproto-devel-1.0.5-4.18.aarch64.rpm"
RPM_HASH = "48125604edf69dbf23c77e32d3457f499985b5e80915677aa1d102b0b8c85825d61ba853b3265189800a835d701aef098f33f77b484099dfabe142fa823ba022"

RPROVIDES:${PN} += "pkgconfig-printproto \
printproto-devel \
xorg-x11-proto-devel-/usr/lib64/pkgconfig/printproto.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-xau"

inherit rpm
