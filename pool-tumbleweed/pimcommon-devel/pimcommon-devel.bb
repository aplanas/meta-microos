SUMMARY = "Development package for pimcommon"
DESCRIPTION = "The development package for the pimcommon libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "pimcommon-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "45d39c05b832ddae491ae8027a09ad4dd6dfa2d311b42af7c9ad7ab90c55fe4df105e56753e8a0ca6b1ab95bb9edcff67864d9ed41b5864a5388594a3cc904e0"

RPROVIDES:${PN} += "cmake-KPim5PimCommon \
cmake-KPim5PimCommonAkonadi \
pimcommon-devel"

RDEPENDS:${PN} += "cmake-KF5Config \
cmake-KF5Contacts \
cmake-KF5KIO \
cmake-KF5TextAutoCorrectionCore \
cmake-KF5TextAutoCorrectionWidgets \
cmake-KF5TextGrammarCheck \
cmake-KF5TextTranslator \
cmake-KPim5Akonadi \
cmake-KPim5AkonadiContact \
cmake-KPim5IMAP \
cmake-KPim5Libkdepim \
cmake-KPim5TextEdit \
ld-linux-aarch64.so.1 \
libKPim5PimCommon.so.5 \
libKPim5PimCommon5 \
libKPim5PimCommonAkonadi.so.5 \
libKPim5PimCommonAkonadi5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
