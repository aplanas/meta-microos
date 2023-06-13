SUMMARY = "Non-ABI stable experimental API for the Qt5 NetworkAuth Library"
DESCRIPTION = "This package provides private headers of libqt5-qtnetworkauth that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtnetworkauth-private-headers-devel-5.15.9+kde0-1.1.noarch.rpm"
RPM_HASH = "0edea4786ae31fdd0a3d60d3046b9afe5e037bac4687b76642c376688b2a59623b51593849df7c3bd7438c60a3e581d017aab087ccb71a2f8365ac53e680471f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtnetworkauth-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtnetworkauth-devel"

inherit rpm
