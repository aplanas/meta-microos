SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "knewstuff-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "6d8493530c9da3ba0d96a96e2831eefb2b3e9f0dbef1ffd21383b84a8dd2ee6ee81ebea4c72f1b46de8838fecd55cc2b8a8683eb4451a6cf97fa9d8c936a8027"

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
