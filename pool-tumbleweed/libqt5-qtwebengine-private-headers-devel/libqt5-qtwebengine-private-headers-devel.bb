SUMMARY = "Non-ABI stable experimental API for the Qt5 WebEngine library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebengine that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtwebengine-private-headers-devel-5.15.14-1.1.noarch.rpm"
RPM_HASH = "f8faf9060f0157ce62f86d2ae94da92d8483cff993fc7ae1501facf1769dd12e73097d1ecb8eba52f1aff017c60cc6190e919bad8f4886fb1cca46b34187057b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebengine-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtdeclarative-private-headers-devel \
libqt5-qtwebengine-devel"

inherit rpm
