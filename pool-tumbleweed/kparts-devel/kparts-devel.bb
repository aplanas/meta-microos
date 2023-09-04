SUMMARY = "Plugin framework for user interface components"
DESCRIPTION = "This library implements the framework for KDE parts, which are \
elaborate widgets with a user-interface defined in terms of actions \
(menu items, toolbar icons). Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kparts-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "8d2cab7ab07b551763dea803264705dd7c89b659dcfc2fbd4b598ebe3e4208c9ec0b482f1e22e131d46b336acac048fd941b6363ebfc096e9f9fefb3242d841e"

RPROVIDES:${PN} += "cmake-KF5Parts \
kparts-devel"

RDEPENDS:${PN} += "cmake-KF5KIO \
cmake-KF5TextWidgets \
cmake-KF5XmlGui \
extra-cmake-modules \
libKF5Parts5"

inherit rpm
