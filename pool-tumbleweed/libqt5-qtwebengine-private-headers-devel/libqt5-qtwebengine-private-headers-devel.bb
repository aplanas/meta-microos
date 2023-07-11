SUMMARY = "Non-ABI stable experimental API for the Qt5 WebEngine library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebengine that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtwebengine-private-headers-devel-5.15.14-1.3.noarch.rpm"
RPM_HASH = "a50362f40250353f93363b11fb32a693aa2f907fbebd631ee51e8d250fa33970d9f3b6ce11fac604a011558b1c1ad35bb5f4b0e377f281baeacf8b324133c318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebengine-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtdeclarative-private-headers-devel \
libqt5-qtwebengine-devel"

inherit rpm
