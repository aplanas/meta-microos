SUMMARY = "Official authentication app for German ID cards and residence permits"
DESCRIPTION = "This app is developed and issued by the German government to be \
used for online authentication with electronic German ID cards \
and residence permits. To use this app, a supported RFID card \
reader or compatible NFC smart phone is required."
LICENSE = "EUPL-1.2"

PV = "1.26.4"

RPM_NAME = "AusweisApp2-1.26.4-1.1.aarch64.rpm"
RPM_HASH = "82870df5f700479213ce4c5217f43962a4e7f0438e02a53256dfe03f05e0260b8cd6cf3d8bbacc0287e5daabab53a0fe1236404509fb337c53450c9066fa8f24"

RPROVIDES:${PN} += "AusweisApp2 AusweisApp2(aarch-64) application() application(com.governikus.ausweisapp2.desktop) metainfo() metainfo(com.governikus.ausweisapp2.metainfo.xml)"
RDEPENDS:${PN} += "hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Network.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6QuickControls2.so.6()(64bit) libQt6QuickControls2.so.6(Qt_6)(64bit) libQt6StateMachine.so.6()(64bit) libQt6StateMachine.so.6(Qt_6)(64bit) libQt6Svg.so.6()(64bit) libQt6Svg.so.6(Qt_6)(64bit) libQt6WebSockets.so.6()(64bit) libQt6WebSockets.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libpcsclite.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
