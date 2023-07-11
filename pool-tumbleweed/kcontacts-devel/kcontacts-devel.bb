SUMMARY = "Development files for kcontacts"
DESCRIPTION = "Development files for kcontacts, a Qt5 library to access \
address books."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kcontacts-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "e26f6c3da483095ec4c0790b503928ea5c301146017b28d4ee7d0f3babbd7bdd74d049f6279fb5cdb54133b4adcdf9a41f8290d159209acba9cd5c74016c881c"

RPROVIDES:${PN} += "cmake-KF5Contacts \
kcontacts-devel \
kcontacts5-devel"

RDEPENDS:${PN} += "cmake-KF5Codecs \
cmake-KF5Config \
cmake-KF5CoreAddons \
cmake-KF5I18n \
libKF5Contacts5"

inherit rpm
