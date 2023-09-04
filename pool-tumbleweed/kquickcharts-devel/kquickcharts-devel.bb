SUMMARY = "Header files for kquickcharts, a set of charts for QtQuick applications"
DESCRIPTION = "Development files for KQuickCharts, a set of charts that can be used from QtQuick \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kquickcharts-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "c9b1dc4bf5f1e34fba11c587aaacf28253f80292c5b83e4e474189246ee1495f2a82268d0a21b28593ac77abb6f81df2a3499a384ef6f2ed66c2123ad46736a1"

RPROVIDES:${PN} += "cmake-KF5QuickCharts \
kquickcharts-devel"

RDEPENDS:${PN} += "kquickcharts"

inherit rpm
