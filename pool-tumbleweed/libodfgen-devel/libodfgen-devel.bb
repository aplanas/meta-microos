SUMMARY = "Library to generate ODF documents from libwpd's and libwpg's api calls"
DESCRIPTION = "libodfgen is a general purpose library designed to generate ODF documents \
from api calls to libwpd and libwpg libraries."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.1.8"

RPM_NAME = "libodfgen-devel-0.1.8-3.9.aarch64.rpm"
RPM_HASH = "e1516b9a29367acc015f5af5dcfaaf6788b2707aec9286174a9ad129d87cca91845ca8ce297bf60cd30b300ca5b68fc7002a4c789c86a6414fad3bf5332cb6af"

RPROVIDES:${PN} += "libodfgen-devel \
pkgconfig-libodfgen-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libodfgen-0-1-1 \
libstdc++-devel \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-stream-0.0"

inherit rpm
