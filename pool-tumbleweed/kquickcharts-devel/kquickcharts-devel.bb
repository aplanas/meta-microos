SUMMARY = "Header files for kquickcharts, a set of charts for QtQuick applications"
DESCRIPTION = "Development files for KQuickCharts, a set of charts that can be used from QtQuick \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kquickcharts-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "fdca595c3a5c27ee1263033bceb51eb466d90765b2721be3e1ebddefa3486e64b5b2fb58e6e37f478fd01a2d6f66773139320676453ceb8e3dc28afb8aadd791"

RPROVIDES:${PN} += "cmake-KF5QuickCharts \
kquickcharts-devel"

RDEPENDS:${PN} += "kquickcharts"

inherit rpm
