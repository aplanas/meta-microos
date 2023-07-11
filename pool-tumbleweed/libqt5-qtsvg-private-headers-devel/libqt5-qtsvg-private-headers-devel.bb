SUMMARY = "Non-ABI stable experimental API for the Qt5 SVG library"
DESCRIPTION = "This package provides private headers of libqt5-qtsvg that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde8"

RPM_NAME = "libqt5-qtsvg-private-headers-devel-5.15.10+kde8-1.1.noarch.rpm"
RPM_HASH = "7ce07912ff8a2ab65f00262db26e7b7065fd72c91318a583855572fb1ec19e192dbd41c58f45968d481e6e4196b694f6d9a591445f9e38d287f4b018eadad8eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Svg-private-headers-devel \
libqt5-qtsvg-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtsvg-devel"

inherit rpm
