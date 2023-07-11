SUMMARY = "Build environment for kcmutils, a set of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kcmutils-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "e640cfdcfa83001a66b626a528678df647351acc3e04415f3604daee7defce5fe12e8cf4236b05bb40e24231396bd9ea00e89bf5424c9a271036b193a7e606ac"

RPROVIDES:${PN} += "cmake-KF5KCMUtils \
kcmutils-devel"

RDEPENDS:${PN} += "cmake-KF5ConfigWidgets \
cmake-KF5Service \
extra-cmake-modules \
libKF5KCMUtils5 \
libKF5KCMUtilsCore5"

inherit rpm
