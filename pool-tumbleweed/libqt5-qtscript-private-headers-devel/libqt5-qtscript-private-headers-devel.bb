SUMMARY = "Non-ABI stable experimental API for the Qt5 Script library"
DESCRIPTION = "This package provides private headers of libqt5-qtscript that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "(LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later) & LGPL-2.0-or-later & LGPL-2.1-only"

PV = "5.15.12"

RPM_NAME = "libqt5-qtscript-private-headers-devel-5.15.12-2.3.noarch.rpm"
RPM_HASH = "3aee64beec33a31e497b9cbe4a745fa93cf82b9ff542c8eb03647100db8f3714bd67426ab7fb059841e7f003315f0f231c9900abf7ea271eb59878b77ba0303a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Script-private-headers-devel \
libqt5-qtscript-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Widgets-private-headers-devel \
libqt5-qtscript-devel"

inherit rpm
