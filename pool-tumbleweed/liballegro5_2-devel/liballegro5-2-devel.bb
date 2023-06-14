SUMMARY = "Development files for liballegro"
DESCRIPTION = "Development files needed to build applications which use liballegro."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro5_2-devel-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "e425d3068acc8be5000d1d380223919c5decb001d8c5b16139cec2e73b3859378b577c9e2244e9d8036ed2e0b654088f977557f7eeade2ff98228861435b77dd"

RPROVIDES:${PN} += "liballegro5-2-devel \
pkgconfig-allegro-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro5-2 \
pkgconfig-gl \
pkgconfig-x11"

inherit rpm
