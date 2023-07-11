SUMMARY = "Development package for pimcommon"
DESCRIPTION = "The development package for the pimcommon libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "pimcommon-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "85ae7797f2c3e93b895529f7efb24116247ad4916b06b6f002d365652f9613677c0ce98f0d4e45784a6d278c93dcdec6fe6f7193d371d0040710c501be2d76b7"

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
