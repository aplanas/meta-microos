SUMMARY = "Telepathy common module"
DESCRIPTION = "ktp-common-internals is the base library for all the KDE Telepathy packages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-common-internals-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "9157617a28a9b2552bd26d134b3662bcd992ed12757f92690a5f7a68da253baeb94aca856db9716bc8c36169bf4290b959db3fcb523ed756881316ddfe0ec184"

RPROVIDES:${PN} += "cmake-KTp \
ktp-common-internals-devel \
ktp-common-internals5-devel"

RDEPENDS:${PN} += "cmake-KF5KCMUtils \
cmake-KF5Wallet \
cmake-Qt5Widgets \
extra-cmake-modules \
ktp-common-internals \
pkgconfig \
telepathy-logger-qt5-devel \
telepathy-qt5-devel"

inherit rpm
