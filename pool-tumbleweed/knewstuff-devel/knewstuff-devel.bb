SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "knewstuff-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "d59fa8e1d80b1dc92c283a7dad94e921c301ddc86fdde9f1a0ccda6a2201bff64bd46213908a4c3fa2a4656a47f101bb29f0088e5e9b9ebf4e0993aac5ca7ab9"

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
