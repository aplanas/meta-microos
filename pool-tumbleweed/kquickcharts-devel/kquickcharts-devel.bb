SUMMARY = "Header files for kquickcharts, a set of charts for QtQuick applications"
DESCRIPTION = "Development files for KQuickCharts, a set of charts that can be used from QtQuick \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kquickcharts-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "f19a8269e06378095ccd01f825c389cbe0b3f37e083bf3f9467c662d493450a2af17cfd68eb6df35c374038ced25842e9b60c98386a5c91bc20443a0aa79f9c3"

RPROVIDES:${PN} += "cmake(KF5QuickCharts) \
kquickcharts-devel \
kquickcharts-devel(aarch-64)"
RDEPENDS:${PN} += "kquickcharts"

inherit rpm
