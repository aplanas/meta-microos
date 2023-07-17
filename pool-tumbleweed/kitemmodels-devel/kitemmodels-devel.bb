SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kitemmodels-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "08670be59da52f517c1474d3732fad7bf8fffb5556a99bc1e0eafe7204d9a812e8b8d04c41967a3ee60a7557905f65fc004f76f36fbdac16df8edf16f1f29acd"

RPROVIDES:${PN} += "cmake-KF5ItemModels \
kitemmodels-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5ItemModels5"

inherit rpm
