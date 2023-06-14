SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kitemmodels-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "d7e84ff47ef2020319f83d5d19cdd96d3591a00ac0be8f392b89d307cbddc5433c59915b78937cfcfa02ec01a6d6f91d68c177d77dec297d262f06441ac10432"

RPROVIDES:${PN} += "cmake-KF5ItemModels \
kitemmodels-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5ItemModels5"

inherit rpm
