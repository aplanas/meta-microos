SUMMARY = "Header files for libdisplay-info, an EDID library"
DESCRIPTION = "The library provides a set of low- and high-level functions \
for EDID and DisplayID. \
 \
This package contains headers for the library."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "libdisplay-info-devel-0.1.1-1.4.aarch64.rpm"
RPM_HASH = "40241778839018249211a33d7d09f91b7c206fc3cb41c492d86813c7cbf239374fff09415109a74f71410611d81223b9ce4ec0f2197054b0c1bce190f4659f05"

RPROVIDES:${PN} += "libdisplay-info-devel \
pkgconfig-libdisplay-info"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdisplay-info.so.1 \
libdisplay-info1 \
libm.so.6"

inherit rpm
