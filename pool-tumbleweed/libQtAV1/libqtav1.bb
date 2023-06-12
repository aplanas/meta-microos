SUMMARY = "Qt multimedia framework library"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. \
 \
This package contains the QtAV library."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "libQtAV1-1.13.0-3.25.aarch64.rpm"
RPM_HASH = "83079911d17f46cb797c619fe7e74d357dd9a95ee1e1367fbe2ec01ea11d568cf8c950058813ee272c720459ad9ca19607b1558c86860c12e7162b8991f47f77"

RPROVIDES:${PN} += "libQtAV.so.1()(64bit) \
libQtAV1 \
libQtAV1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGLESv2.so.2()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavdevice.so.58.13()(64bit) \
libavdevice.so.58.13(LIBAVDEVICE_58)(64bit) \
libavfilter.so.7.110()(64bit) \
libavfilter.so.7.110(LIBAVFILTER_7)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavresample.so.4.0()(64bit) \
libavresample.so.4.0(LIBAVRESAMPLE_4)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libswresample.so.3.9()(64bit) \
libswresample.so.3.9(LIBSWRESAMPLE_3)(64bit) \
libswscale.so.5.9()(64bit) \
libswscale.so.5.9(LIBSWSCALE_5)(64bit) \
libva.so.2()(64bit) \
libva.so.2(VA_API_0.33.0)(64bit)"

inherit rpm
