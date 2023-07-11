SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "knotifyconfig-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "d32f5a26b9a80c900533369473490855b6dc45386e4194775c318533dc6927d3db3fdcbdd4665ca982641b5726fd8a923249586664ef5e69bb52a29a7466a933"

RPROVIDES:${PN} += "cmake-KF5NotifyConfig \
knotifyconfig-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
extra-cmake-modules \
libKF5NotifyConfig5"

inherit rpm
