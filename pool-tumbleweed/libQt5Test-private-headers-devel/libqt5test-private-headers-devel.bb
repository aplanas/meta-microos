SUMMARY = "Non-ABI stable experimental API for the Qt5 test library"
DESCRIPTION = "This package provides private headers of libQt5Test that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Test-private-headers-devel-5.15.10+kde129-1.1.noarch.rpm"
RPM_HASH = "306a4a2464503cf752e4a466e1814c93ebe8cf798d3b4ea431828e0d74ad826276147cc68c3d017740b4728463fc543a17c3a9fa1ed9ab8d4abe671153a344ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Test-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Test-devel"

inherit rpm
