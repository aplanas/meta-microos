SUMMARY = "Non-ABI stable experimental API for the Qt5 WebEngine library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebengine that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtwebengine-private-headers-devel-5.15.14-2.1.noarch.rpm"
RPM_HASH = "a68c8bd8695d9d9f0620c3c87b7ffd9d0b6ef97b3427ad44a20b2a2446b6f5c03b8e87ccd631fb705d375968ddb2c8875917eff0eb022a30e4036e590d7683ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebengine-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtdeclarative-private-headers-devel \
libqt5-qtwebengine-devel"

inherit rpm
