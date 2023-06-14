SUMMARY = "Dictionary Lookup Program"
DESCRIPTION = "The Next Generation GoldenDict: A feature-rich dictionaries lookup program, supporting many dictionary formats."
LICENSE = "GPL-3.0-or-later"

PV = "23.05.03"

RPM_NAME = "goldendict-ng-23.05.03-1.1.aarch64.rpm"
RPM_HASH = "5e012989afc8e45540dbe6d599472806aa77e8856af08910da4aa43ee218bd7e39be60b15e444f2f062319bcc0297e846fa67a513ef1dfd32e91dbc9ebea21a1"

RPROVIDES:${PN} += "goldendict \
goldendict-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6TextToSpeech.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libX11.so.6 \
libXtst.so.6 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libbz2.so.1 \
libc.so.6 \
libeb.so.16 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
liblzma.so.5 \
liblzo2.so.2 \
libm.so.6 \
libopencc.so.1.1 \
libstdc++.so.6 \
libswresample.so.4 \
libvorbisfile.so.3 \
libxapian.so.30 \
libz.so.1 \
libzstd.so.1"

inherit rpm
