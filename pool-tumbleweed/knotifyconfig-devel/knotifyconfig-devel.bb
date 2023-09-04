SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "knotifyconfig-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "b29ce6558161e1e7101eadd4782db02966d9038abc066307ce663aeb1d5049a706c161b3a5d2dd038129b409b4e24fc4e5c3f8990ed5f76d829c26e88fc45900"

RPROVIDES:${PN} += "cmake-KF5NotifyConfig \
knotifyconfig-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
extra-cmake-modules \
libKF5NotifyConfig5"

inherit rpm
