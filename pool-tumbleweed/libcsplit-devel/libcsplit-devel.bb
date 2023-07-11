SUMMARY = "Development files for libcsplit, a C split string library"
DESCRIPTION = "A library for C split string functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcsplit."
LICENSE = "LGPL-3.0-or-later"

PV = "20220109"

RPM_NAME = "libcsplit-devel-20220109-3.3.aarch64.rpm"
RPM_HASH = "a1dfb7ed9e5ac43f40a57bf9043bda839235f50fd78f4b4d84908325c299784b5c40cfbbd57c9d564ba8b7389552bcb34d32029ab0c155b6863564e88bc01110"

RPROVIDES:${PN} += "libcsplit-devel \
pkgconfig-libcsplit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcsplit1"

inherit rpm
