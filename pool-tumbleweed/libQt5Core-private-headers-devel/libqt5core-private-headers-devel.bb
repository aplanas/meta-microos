SUMMARY = "Non-ABI stable experimental API for the Qt5 core library"
DESCRIPTION = "This package provides private headers of libQt5Core that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Core-private-headers-devel-5.15.10+kde129-1.1.noarch.rpm"
RPM_HASH = "9eed7becca944df5a29d0bc86c957cc5476284e3728d9537d9b1f9ee99a006c48dcfc91f2563288b3b06e10017df2be40cb51ee5a9fde1723a72b51ea8854dc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Core-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-devel"

inherit rpm
