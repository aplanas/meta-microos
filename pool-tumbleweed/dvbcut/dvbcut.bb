SUMMARY = "Qt application for cutting parts out of DVB streams"
DESCRIPTION = "DVBcut is a Qt application that allows you to select certain parts of an MPEG \
transport stream (as received via Digital Video Broadcasting, DVB) and save \
these parts into a single MPEG output file. It follows a `keyhole surgery'' \
approach where the input video and audio data is mostly kept unchanged, and \
only very few frames at the beginning and/or end of the selected range are re- \
encoded in order to obtain a valid MPEG file."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "0.7.4"

RPM_NAME = "dvbcut-0.7.4-1.6.aarch64.rpm"
RPM_HASH = "81721de9bd74a9fb7d2682a67b0ed4ba2c64e2b423fad8cfc8efb10f2b017c0ef7a8fa1421cafce4062f589c2b029f643081e467f5f42ee0e8467309d281c8d4"

RPROVIDES:${PN} += "application() \
application(dvbcut.desktop) \
dvbcut \
dvbcut(aarch-64) \
mimehandler(application/x-dvbcut) \
mimehandler(video/mp2t) \
mimehandler(video/mpeg)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
liba52.so.0()(64bit) \
libao.so.4()(64bit) \
libao.so.4(LIBAO4_1.1.0)(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmad.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libswscale.so.7()(64bit) \
libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit)"

inherit rpm
