SUMMARY = "Deepin Screen Recorder"
DESCRIPTION = "deepin-screen-recorder is free and open source software for screen recording."
LICENSE = "GPL-3.0-or-later"

PV = "5.11.6"

RPM_NAME = "deepin-screen-recorder-5.11.6-1.6.aarch64.rpm"
RPM_HASH = "819dffc8acafc79ec7089350f4aaf777cd055abf4665b476d652f918df53aa83227dbf7dfc13410bfa8dfcbb1db1717bc5cdf7fa73eea51de58c9446f7719a5f"

RPROVIDES:${PN} += "application() application(deepin-screen-recorder.desktop) deepin-screen-recorder deepin-screen-recorder(aarch-64)"
RDEPENDS:${PN} += "byzanz ffmpeg ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXtst.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdframeworkdbus.so.2()(64bit) libdtkcore.so.5()(64bit) libdtkgui.so.5()(64bit) libdtkwidget.so.5()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libopencv_core.so.407()(64bit) libopencv_imgproc.so.407()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
