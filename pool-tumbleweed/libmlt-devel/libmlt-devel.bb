SUMMARY = "Development files for MLT's C and C++ language API"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
This subpackage contains the headers to make use of the MLT C and \
C++ API."
LICENSE = "GPL-3.0-or-later"

PV = "7.14.0"

RPM_NAME = "libmlt-devel-7.14.0-2.2.aarch64.rpm"
RPM_HASH = "75e68d91ad771dd44c070a1bf426700028e9558c0695f61b47866c02d72fec5b6805db1bdb43a48afe9c8329aad94cacf54bf9ab5b489b2efcc3feff43fb45f0"

RPROVIDES:${PN} += "cmake(Mlt7) \
libmlt++-devel \
libmlt-devel \
libmlt-devel(aarch-64) \
pkgconfig(mlt++-7) \
pkgconfig(mlt-framework-7)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmlt++-7-7 \
libmlt-7-7 \
pkgconfig(mlt-framework-7)"

inherit rpm
