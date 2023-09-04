SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "knewstuff-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "6c62c0629cae24c18de8a49a70537f80b01974f8f81da6f2f3037d95bda2ee3ea119ee0ac5ec4aa46e7e42514dfecfdef0d05425c616d7ff2d9238b9fdcc8116"

RPROVIDES:${PN} += "cmake-KF5NewStuff \
knewstuff-devel"

RDEPENDS:${PN} += "cmake-KF5NewStuffQuick \
cmake-KF5Service \
cmake-KF5XmlGui \
cmake-Qt5Widgets \
extra-cmake-modules \
knewstuff-core-devel \
ld-linux-aarch64.so.1 \
libKF5NewStuff5 \
libKF5NewStuffCore5 \
libKF5NewStuffWidgets.so.5 \
libKF5NewStuffWidgets5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
