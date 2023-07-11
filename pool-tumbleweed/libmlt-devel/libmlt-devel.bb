SUMMARY = "Development files for MLT's C and C++ language API"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
This subpackage contains the headers to make use of the MLT C and \
C++ API."
LICENSE = "GPL-3.0-or-later"

PV = "7.16.0"

RPM_NAME = "libmlt-devel-7.16.0-1.2.aarch64.rpm"
RPM_HASH = "30b093162b1feea3ea18de84b3fab3770a2a6bb12a0c4d9a9eb5c9c04cd3c4f795599851b8aa7cbaaa7e72d77daacbcd3a57f437a93c43079bae3b04bde26fa9"

RPROVIDES:${PN} += "cmake-Mlt7 \
libmlt++-devel \
libmlt-devel \
pkgconfig-mlt++-7 \
pkgconfig-mlt-framework-7"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmlt++-7-7 \
libmlt-7-7 \
pkgconfig-mlt-framework-7"

inherit rpm
