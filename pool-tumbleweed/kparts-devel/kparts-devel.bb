SUMMARY = "Plugin framework for user interface components"
DESCRIPTION = "This library implements the framework for KDE parts, which are \
elaborate widgets with a user-interface defined in terms of actions \
(menu items, toolbar icons). Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kparts-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "a2a1837d83f48131a506982454ac78ce89b72772fa842db98b018277de2022e7e2fbb1b6144f34599157b0aa5e31f884b9ebfcf99b6ba1a65f0374b39412918a"

RPROVIDES:${PN} += "cmake-KF5Parts \
kparts-devel"

RDEPENDS:${PN} += "cmake-KF5KIO \
cmake-KF5TextWidgets \
cmake-KF5XmlGui \
extra-cmake-modules \
libKF5Parts5"

inherit rpm
