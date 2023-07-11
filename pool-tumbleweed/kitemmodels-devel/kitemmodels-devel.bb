SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kitemmodels-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "d7041a6f6d6f9967dba01ffff78d71a50de9930f6d9cd107652dc03da194d0fbb016a5d93c4756de809572de962c49da3d4836d22d534846b1eed1b8cfc5728d"

RPROVIDES:${PN} += "cmake-KF5ItemModels \
kitemmodels-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5ItemModels5"

inherit rpm
