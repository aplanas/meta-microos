SUMMARY = "Non-ABI stable experimental API for the Qt5 WebSocket library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebsockets that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only |  (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde2"

RPM_NAME = "libqt5-qtwebsockets-private-headers-devel-5.15.10+kde2-1.1.noarch.rpm"
RPM_HASH = "e23fe1f65965fb70a3bd7bff4dd8bba699b99fd9a90210b062c26ca2e3a409db9c1a7725243f6dc7b8de0734760547f00e84252d2800281950e93ac035acce63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebsockets-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtwebsockets-devel"

inherit rpm
