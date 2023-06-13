SUMMARY = "Library to generate ODF documents from libwpd's and libwpg's api calls"
DESCRIPTION = "libodfgen is a general purpose library designed to generate ODF documents \
from api calls to libwpd and libwpg libraries."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.1.8"

RPM_NAME = "libodfgen-devel-0.1.8-3.8.aarch64.rpm"
RPM_HASH = "9fbb7abd298cb4c534a32306771686fdb5b0b777bcd1e3b96b51e0151972bba23d299096a182363f822ea34da61c6593a03f1393809716782fc4e16585db6c50"

RPROVIDES:${PN} += "libodfgen-devel \
libodfgen-devel(aarch-64) \
pkgconfig(libodfgen-0.1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libodfgen-0_1-1 \
libstdc++-devel \
pkgconfig(librevenge-0.0) \
pkgconfig(librevenge-stream-0.0)"

inherit rpm
