SUMMARY = "Development files for alure"
DESCRIPTION = "The alure-devel package contains libraries and header files for \
developing applications that use alure."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "alure-devel-1.2-4.5.aarch64.rpm"
RPM_HASH = "da9a9ceb283fef633a989df677753a3791def7d3f75ba9e68a6ea0496d7daa7adffb616b1339d0a4f36fc061be4df46d85b2513fd4bcdeed1186d2b5882dc24c"

RPROVIDES:${PN} += "alure-devel \
pkgconfig-alure"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libalure1 \
pkgconfig-openal"

inherit rpm
