SUMMARY = "Development files for INIH"
DESCRIPTION = "INI Not Invented Here is a simple parser for .INI files written in C and mostly \
compatible with Python's ConfigParser. \
 \
This package provides the development headers for INIH including the C++ bindings."
LICENSE = "BSD-3-Clause"

PV = "56"

RPM_NAME = "libinih-devel-56-1.4.aarch64.rpm"
RPM_HASH = "7dfd0998b18470161bd328f6338a9ccc09d10b41efc1deb5b7230f7f3db3cccfebc62a613d4a2d22843a2c0c8bcbb321e35f3312a67cc1ca7746add4663f7fc5"

RPROVIDES:${PN} += "libinih-devel \
libinih-devel(aarch-64) \
pkgconfig(INIReader) \
pkgconfig(inih)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinih0 \
pkgconfig(inih)"

inherit rpm
