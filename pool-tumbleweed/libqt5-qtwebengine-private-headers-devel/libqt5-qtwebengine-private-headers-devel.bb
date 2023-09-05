SUMMARY = "Non-ABI stable experimental API for the Qt5 WebEngine library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebengine that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.15"

RPM_NAME = "libqt5-qtwebengine-private-headers-devel-5.15.15-1.1.noarch.rpm"
RPM_HASH = "fdd1e8d07d15d89c51680cd152f6c2c661ee725a02635f5de6a6346b6268d4884d2d529d95d032e1054cb814ca5114557d09002d0704a6bf3b7021c242b964f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebengine-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtdeclarative-private-headers-devel \
libqt5-qtwebengine-devel"

inherit rpm
