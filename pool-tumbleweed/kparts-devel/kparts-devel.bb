SUMMARY = "Plugin framework for user interface components"
DESCRIPTION = "This library implements the framework for KDE parts, which are \
elaborate widgets with a user-interface defined in terms of actions \
(menu items, toolbar icons). Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kparts-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "70b37e7ac4036498f51269498231d955329e1d5fc02224fc0b029d2bd9dc4cfd92294de2074d4d6a19986c5ff6efa75fd66a4871be7b796e9ae41a4d020c2f4d"

RPROVIDES:${PN} += "cmake-KF5Parts \
kparts-devel"

RDEPENDS:${PN} += "cmake-KF5KIO \
cmake-KF5TextWidgets \
cmake-KF5XmlGui \
extra-cmake-modules \
libKF5Parts5"

inherit rpm
