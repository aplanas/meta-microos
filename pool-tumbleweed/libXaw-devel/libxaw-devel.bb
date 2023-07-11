SUMMARY = "Development files for the X Athena Widget Set"
DESCRIPTION = "The X Window System Athena widget set implements simple user \
interfaces based upon the X Toolkit Intrinsics (Xt) library. \
 \
This package contains the development headers for the library found \
in libXaw6/libXaw7/libXaw8."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "libXaw-devel-1.0.15-1.4.aarch64.rpm"
RPM_HASH = "eccf81d28f91b11726c016b29175b41e316d25c4adea80902f10cc0168dd6d3f8f9e9cc2a5c0a2abf2f8ce376ee278f082df2007889e4fc1806e4796d2c4d16b"

RPROVIDES:${PN} += "libXaw-devel \
pkgconfig-xaw6 \
pkgconfig-xaw7"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXaw6 \
libXaw7 \
libXaw8 \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xmu \
pkgconfig-xpm \
pkgconfig-xproto \
pkgconfig-xt"

inherit rpm
