SUMMARY = "Some demo applications for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This package contains some demo applications for package MyGUI."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "MyGUI-demo-3.4.1-2.1.aarch64.rpm"
RPM_HASH = "d0b073c51b94d2d0f06b1fd044831f136892d7e80a887993c2aaaaec6a9d9c358f091f8a54b763b264a05da0933c40f007f55c73dfea30923ea43a9c89f13c67"

RPROVIDES:${PN} += "MyGUI-demo MyGUI-demo(aarch-64)"
RDEPENDS:${PN} += "MyGUI ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libMyGUI.OgrePlatform.so()(64bit) libMyGUICommon.so.3.4.1()(64bit) libMyGUIEngine.so.3.4.1()(64bit) libOgreMain.so.13.5()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
