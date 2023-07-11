SUMMARY = "Telepathy common module"
DESCRIPTION = "ktp-common-internals is the base library for all the KDE Telepathy packages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ktp-common-internals-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "628e271348b166d3d74b4a1d8bcd11129f427be9914c740f374472edf737c4a6782848af853a1c8676465bf513e86ec370028af6ab2d726a6258e5ec45d5b2a6"

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
