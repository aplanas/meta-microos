SUMMARY = "Development package for pimcommon"
DESCRIPTION = "The development package for the pimcommon libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "pimcommon-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b7dad16dde16c98551d248319d957d111e78bb2b015b1113fef8b9d1e6b33d68c96aa4019310544d0a71a968ed0cfaa8f71b7df19b92b5ea508c0d107fd63058"

RPROVIDES:${PN} += "cmake-KF5PimCommon \
cmake-KF5PimCommonAkonadi \
pimcommon-devel"

RDEPENDS:${PN} += "cmake-KF5Config \
cmake-KF5Contacts \
cmake-KF5KIO \
cmake-KF5TextAutoCorrection \
cmake-KF5TextGrammarCheck \
cmake-KF5TextTranslator \
cmake-KPim5Akonadi \
cmake-KPim5AkonadiContact \
cmake-KPim5IMAP \
cmake-KPim5TextEdit \
ld-linux-aarch64.so.1 \
libKF5PimCommon.so.5 \
libKF5PimCommon5 \
libKF5PimCommonAkonadi.so.5 \
libKF5PimCommonAkonadi5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
