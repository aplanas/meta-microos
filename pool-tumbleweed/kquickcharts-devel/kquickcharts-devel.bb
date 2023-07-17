SUMMARY = "Header files for kquickcharts, a set of charts for QtQuick applications"
DESCRIPTION = "Development files for KQuickCharts, a set of charts that can be used from QtQuick \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kquickcharts-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "7304c41ad966a133d9e6fc5997fd14d3eeb810d104d2ab0ecc9557b5b228f10310e194167957f90d26945eb956d6ee7786cf77569895481764fa1b1aa1bc398a"

RPROVIDES:${PN} += "cmake-KF5QuickCharts \
kquickcharts-devel"

RDEPENDS:${PN} += "kquickcharts"

inherit rpm
