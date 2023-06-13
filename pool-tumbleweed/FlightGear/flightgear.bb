SUMMARY = "Flight Simulator"
DESCRIPTION = "The FlightGear project is working to create a sophisticated flight \
simulator framework for the development and pursuit of interesting \
flight simulator ideas. We are developing a solid basic sim that can be \
expanded and improved upon by anyone interested in contributing"
LICENSE = "GPL-2.0-only"

PV = "2020.3.18"

RPM_NAME = "FlightGear-2020.3.18-1.1.aarch64.rpm"
RPM_HASH = "4322c034126c913f290ac9ce3ef2687740cff99ebec56cf9157a98139dd13e86c5b61596debe359f341258c88e92ddf40bd2a8cc375e3f8134a1d00fb5d70f72"

RPROVIDES:${PN} += "FlightGear \
FlightGear(aarch-64) \
application() \
application(org.flightgear.FlightGear.desktop) \
metainfo() \
metainfo(org.flightgear.FlightGear.metainfo.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGLX.so.0()(64bit) \
libOpenGL.so.0()(64bit) \
libOpenThreads.so.21()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libSimGearCore.so.2020.3.18()(64bit) \
libSimGearScene.so.2020.3.18()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libevent_core-2.1.so.7()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenal.so.1()(64bit) \
libosg.so.161()(64bit) \
libosgDB.so.161()(64bit) \
libosgGA.so.161()(64bit) \
libosgText.so.161()(64bit) \
libosgUtil.so.161()(64bit) \
libosgViewer.so.161()(64bit) \
libplibpu.so.0()(64bit) \
libplibpuaux.so.0()(64bit) \
libplibsg.so.0()(64bit) \
libplibul.so.0()(64bit) \
libspeex.so.1()(64bit) \
libspeexdsp.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libz.so.1()(64bit)"

inherit rpm
