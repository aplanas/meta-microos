SUMMARY = "Deepin-terminal libraries"
DESCRIPTION = "This package contains the libraries for deepin-terminal"
LICENSE = "GPL-3.0-only"

PV = "5.4.33"

RPM_NAME = "libterminalwidget5-0-5.4.33-1.8.aarch64.rpm"
RPM_HASH = "56cedb670b2470d3f37b377636ce4449ccd6390206f376eae69e77a57fb85ec5ae5a43f78669fddaf1fd950a579e1270d0745dfee1053647e32370ff35c82e76"

RPROVIDES:${PN} += "libterminalwidget5-0 \
libterminalwidget5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
