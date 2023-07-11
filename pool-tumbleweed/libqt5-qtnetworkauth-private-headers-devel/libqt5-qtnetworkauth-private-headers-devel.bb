SUMMARY = "Non-ABI stable experimental API for the Qt5 NetworkAuth Library"
DESCRIPTION = "This package provides private headers of libqt5-qtnetworkauth that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtnetworkauth-private-headers-devel-5.15.10+kde0-1.1.noarch.rpm"
RPM_HASH = "15e5ad53a73dcbb5bf6d828bd56a5188a1e98823d6e9c8b4f6d9e5a69d5b220e651af45417d8593b5e18b45543c1e262b3983a1e6b72918cdb2429006291c03e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtnetworkauth-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtnetworkauth-devel"

inherit rpm
