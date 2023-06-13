SUMMARY = "Build environment for kcmutils, a set of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kcmutils-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "d882b4875ed3899f7089e2f96b926a476635f29a405c69e0ab196b7b1a800ecc275211d0cd8ea495ed4ce88ec92f73ef8e7295161635fea2fac2a2d9f1ba972e"

RPROVIDES:${PN} += "cmake(KF5KCMUtils) \
kcmutils-devel \
kcmutils-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(KF5ConfigWidgets) \
cmake(KF5Service) \
extra-cmake-modules \
libKF5KCMUtils5 \
libKF5KCMUtilsCore5"

inherit rpm
