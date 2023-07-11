SUMMARY = "Panorama Tools Back-End Library"
DESCRIPTION = "Development files for library for working with panoramas."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.21"

RPM_NAME = "libpano-devel-2.9.21-1.9.aarch64.rpm"
RPM_HASH = "a4619de85de8a12e9321eab7e93b8965273be635fa849925191636fd0f05ec7e3220d1507fc2b9b79386b07af384d753d0f825478e1cb7618685faa04cbcfc00"

RPROVIDES:${PN} += "libpano-devel \
pkgconfig-libpano13"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libpano13-3"

inherit rpm
