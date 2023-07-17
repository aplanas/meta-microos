SUMMARY = "Non-ABI stable experimental API for the Qt5 widgets library"
DESCRIPTION = "This package provides private headers of libQt5Widgets that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Widgets-private-headers-devel-5.15.10+kde129-2.1.noarch.rpm"
RPM_HASH = "bee0a2bba4e2d705a2053ed75037a629bfe04e1a42d70460e388a69bbf42eb569f00cf311381027915283000eb1376e5b474399d582b7e0f082f6ba103f3fd53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Widgets-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5Widgets-devel"

inherit rpm
