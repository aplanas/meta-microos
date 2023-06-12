SUMMARY = "Dictionary Lookup Program"
DESCRIPTION = "The Next Generation GoldenDict: A feature-rich dictionaries lookup program, supporting many dictionary formats."
LICENSE = "GPL-3.0-or-later"

PV = "23.05.03"

RPM_NAME = "goldendict-ng-23.05.03-1.1.aarch64.rpm"
RPM_HASH = "5e012989afc8e45540dbe6d599472806aa77e8856af08910da4aa43ee218bd7e39be60b15e444f2f062319bcc0297e846fa67a513ef1dfd32e91dbc9ebea21a1"

RPROVIDES:${PN} += "application() \
application(org.goldendict.GoldenDict.desktop) \
goldendict \
goldendict-ng \
goldendict-ng(aarch-64) \
metainfo() \
metainfo(org.goldendict.GoldenDict.metainfo.xml) \
mimehandler(x-scheme-handler/dict) \
mimehandler(x-scheme-handler/goldendict)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core5Compat.so.6()(64bit) \
libQt6Core5Compat.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Multimedia.so.6()(64bit) \
libQt6Multimedia.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6Svg.so.6()(64bit) \
libQt6Svg.so.6(Qt_6)(64bit) \
libQt6TextToSpeech.so.6()(64bit) \
libQt6TextToSpeech.so.6(Qt_6)(64bit) \
libQt6WebChannel.so.6()(64bit) \
libQt6WebChannel.so.6(Qt_6)(64bit) \
libQt6WebEngineCore.so.6()(64bit) \
libQt6WebEngineCore.so.6(Qt_6)(64bit) \
libQt6WebEngineWidgets.so.6()(64bit) \
libQt6WebEngineWidgets.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libQt6Xml.so.6()(64bit) \
libQt6Xml.so.6(Qt_6)(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libeb.so.16()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhunspell-1.7.so.0()(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
liblzo2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libopencc.so.1.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libswresample.so.4()(64bit) \
libswresample.so.4(LIBSWRESAMPLE_4.10_SUSE)(64bit) \
libvorbisfile.so.3()(64bit) \
libxapian.so.30()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libz.so.1(ZLIB_1.2.0.2)(64bit) \
libz.so.1(ZLIB_1.2.2.3)(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
