SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "knewstuff-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "e4ff6981d5de709293e1c82b84fe8735ed7652b76961588e5b8dfa3733fda7ad8bea43c1a49b59c8fbbb78bc16aab033faeaa51736dadcd3a02c42a6b4a0cae9"

RPROVIDES:${PN} += "cmake(KF5NewStuff) \
knewstuff-devel \
knewstuff-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(KF5NewStuffQuick) \
cmake(KF5Service) \
cmake(KF5XmlGui) \
cmake(Qt5Widgets) \
extra-cmake-modules \
knewstuff-core-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5NewStuff5 \
libKF5NewStuffCore5 \
libKF5NewStuffWidgets.so.5()(64bit) \
libKF5NewStuffWidgets5 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
