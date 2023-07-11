SUMMARY = "Dictionary Lookup Program"
DESCRIPTION = "The Next Generation GoldenDict: A feature-rich dictionaries lookup program, supporting many dictionary formats."
LICENSE = "GPL-3.0-or-later"

PV = "23.05.03"

RPM_NAME = "goldendict-ng-23.05.03-3.1.aarch64.rpm"
RPM_HASH = "02b602c06c68579411739437093772d4a1bcd508a002bf6026e2741d2008701e513bb13d02cbeaf2e44a36e105c0f01b67772ec355092ae66fc057939c53a252"

RPROVIDES:${PN} += "goldendict \
goldendict-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5TextToSpeech.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
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
