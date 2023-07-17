SUMMARY = "Non-ABI stable experimental API for the Qt5 WebEngine library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebengine that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtwebengine-private-headers-devel-5.15.14-1.4.noarch.rpm"
RPM_HASH = "a19fb4fe3974f3aa42a8fc6e21c9c9e09b822d660e5954f7181a5738e86d10e21a52459278cd3c9f818c60218307fce26dd4ecdbacfc03fb1186d1cbda800e6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebengine-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtdeclarative-private-headers-devel \
libqt5-qtwebengine-devel"

inherit rpm
