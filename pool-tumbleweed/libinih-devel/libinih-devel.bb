SUMMARY = "Development files for INIH"
DESCRIPTION = "INI Not Invented Here is a simple parser for .INI files written in C and mostly \
compatible with Python's ConfigParser. \
 \
This package provides the development headers for INIH including the C++ bindings."
LICENSE = "BSD-3-Clause"

PV = "56"

RPM_NAME = "libinih-devel-56-1.5.aarch64.rpm"
RPM_HASH = "f7c8b97b378a08d512f16ad57301550198dc09e72198e8f12c94a4ea3913233746fbf3e763ee9465d53c5c4a0dae90ed22a8910c4835150d5ff36a7402b41e32"

RPROVIDES:${PN} += "libinih-devel \
pkgconfig-INIReader \
pkgconfig-inih"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinih0 \
pkgconfig-inih"

inherit rpm
