SUMMARY = "Development files for libredwg"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD. \
 \
This package contains the files required for development with libredwg."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.5"

RPM_NAME = "libredwg-devel-0.12.5-3.5.aarch64.rpm"
RPM_HASH = "2d6bf08065a588dec59b2244882bad3be5d4143041ff9b68a1600ec9b3f4bd3472dff216ccdfb4a22b5e6a1e74a79ab77c23d32ae2f8bad77dcdb8324a27dec0"

RPROVIDES:${PN} += "libredwg-devel \
pkgconfig-libredwg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libredwg0"

inherit rpm
