SUMMARY = "Build environment for kcmutils, a set of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kcmutils-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "4cfdf97ca0331c39e922eaa346cf9a567139c44644783961d4465ee7cd4f7f6a0f3e0dfbb4338c863e6a9418c8d442244df09b2bb3674ab9f38ba6fa903de917"

RPROVIDES:${PN} += "cmake-KF5KCMUtils \
kcmutils-devel"

RDEPENDS:${PN} += "cmake-KF5ConfigWidgets \
cmake-KF5Service \
extra-cmake-modules \
libKF5KCMUtils5 \
libKF5KCMUtilsCore5"

inherit rpm
