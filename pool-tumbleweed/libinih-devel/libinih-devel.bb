SUMMARY = "Development files for INIH"
DESCRIPTION = "INI Not Invented Here is a simple parser for .INI files written in C and mostly \
compatible with Python's ConfigParser. \
 \
This package provides the development headers for INIH including the C++ bindings."
LICENSE = "BSD-3-Clause"

PV = "57"

RPM_NAME = "libinih-devel-57-1.1.aarch64.rpm"
RPM_HASH = "0f476f48921cf75eabe0ee57e3b00cf4e8dce6844225f7bedd08845c4f45090ce75b9f547dbfe89a26db2a2dc7a5a978000cbe19b22bea565f44d0df8ce53343"

RPROVIDES:${PN} += "libinih-devel \
pkgconfig-INIReader \
pkgconfig-inih"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinih0 \
pkgconfig-inih"

inherit rpm
