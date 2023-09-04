SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kitemmodels-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "593be6cc20058e1529f6d2b72ae47ac682a41de06f907a9e43dc46ad3776fbe912abca0ef123ba380962c18fa69b778a2823d2a61b3d1d0f4b483f1770d09a52"

RPROVIDES:${PN} += "cmake-KF5ItemModels \
kitemmodels-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5ItemModels5"

inherit rpm
