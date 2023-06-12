SUMMARY = "Interactive whiteboard for schools and universities"
DESCRIPTION = "OpenBoard is an open source cross-platform interactive white board \
application designed primarily for use in schools. It was \
originally forked from Open-Sankoré, which was itself based on \
Uniboard. \
 \
This build is based on the development branch 1.7-dev and includes \
a set of additional patches for features and bug fixes."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.0~git20221129.9de37af"

RPM_NAME = "OpenBoard-1.7.0~git20221129.9de37af-2.7.aarch64.rpm"
RPM_HASH = "f5f62a2afc85e74d46ee8b5d42e1e02bf1164a34a0aff06bd03d2777fcc8c6f8950ef5472e5748a87c34199375bba252e3356d29e589d378ed5dc56e2eacb67d"

RPROVIDES:${PN} += "OpenBoard \
OpenBoard(aarch-64) \
application() \
application(ch.openboard.OpenBoard.desktop) \
config(OpenBoard) \
mimehandler(application/ubz)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5MultimediaWidgets.so.5()(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5WebChannel.so.5()(64bit) \
libQt5WebChannel.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpoppler.so.128()(64bit) \
libquazip1-qt5.so.1.4.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libswresample.so.4()(64bit) \
libswresample.so.4(LIBSWRESAMPLE_4.10_SUSE)(64bit) \
libswscale.so.7()(64bit) \
libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) \
libz.so.1()(64bit)"

inherit rpm
