SUMMARY = "Non-ABI stable experimental API"
DESCRIPTION = "This package provides private headers of libqt5-qtdeclarative that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde26"

RPM_NAME = "libqt5-qtdeclarative-private-headers-devel-5.15.10+kde26-1.1.noarch.rpm"
RPM_HASH = "faea47f7828b58c09ecb79d6847e9f7404c4cc37a859f9ecbd40d22e68dab3359416179a9e541a9f2893f8892250e83a215313925498fb762a63a7b22470beb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Quick-private-headers-devel \
libqt5-qtdeclarative-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5Test-private-headers-devel \
libQt5Widgets-private-headers-devel \
libqt5-qtdeclarative-devel"

inherit rpm
