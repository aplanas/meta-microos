SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "knotifyconfig-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "bb9c44a2b5d51597cbf75fa2cf5f0d3d03908fabf9a1a55a61313e4f3323d7122f330a85c07fd64bce0a0093a44b7aaf5720f2d39e9b4a659022939e6ca2e835"

RPROVIDES:${PN} += "cmake-KF5NotifyConfig \
knotifyconfig-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
extra-cmake-modules \
libKF5NotifyConfig5"

inherit rpm
