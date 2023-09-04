SUMMARY = "Build environment for kcmutils, a set of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kcmutils-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "5f47b06f83b6f89097f0c57986d5a5de30cfd63eb4db18dbcb1279d6a9fc313748f703deeb665663473ee3794029524f7cb0287bd116e271dd905101cde64ff1"

RPROVIDES:${PN} += "cmake-KF5KCMUtils \
kcmutils-devel"

RDEPENDS:${PN} += "cmake-KF5ConfigWidgets \
cmake-KF5Service \
extra-cmake-modules \
libKF5KCMUtils5 \
libKF5KCMUtilsCore5"

inherit rpm
