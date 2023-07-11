SUMMARY = "Development libraries and headers for libgme"
DESCRIPTION = "The developmental files that must be installed in order to compile applications \
which use libgme."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.3"

RPM_NAME = "libgme-devel-0.6.3-2.5.aarch64.rpm"
RPM_HASH = "b81df7fd20029148a07d399e37f28ffdb77a47b8b70b387758fe0d99aeb9e31cc727df1519f57a2d590ab82f43966e22ee50ef63ebef978097c26d0b09e60e7d"

RPROVIDES:${PN} += "libgme-devel \
pkgconfig-libgme"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgme0"

inherit rpm
