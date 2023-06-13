SUMMARY = "Non-ABI stable experimental API for Qt5's State Chart XML library"
DESCRIPTION = "This package provides private headers of libqt5-qtscxml that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtscxml-private-headers-devel-5.15.9+kde0-1.1.noarch.rpm"
RPM_HASH = "16fb75d1111a049b7e0a3ea50526fc2827eed3e9a683909e03972cf98eb5c7436038312696f337a94f12d96d37e2fe8d8c2a1b4e2e56baca4062ab03c4fbbf33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtscxml-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtscxml-devel"

inherit rpm
