SUMMARY = "Deepin Screen Recorder"
DESCRIPTION = "deepin-screen-recorder is free and open source software for screen recording."
LICENSE = "GPL-3.0-or-later"

PV = "5.11.6"

RPM_NAME = "deepin-screen-recorder-5.11.6-1.7.aarch64.rpm"
RPM_HASH = "ed910f905a96118895f8dd535a858deb02540594d61b302e38854def9560ef2173a3b0d669273bf869af56afda7dc27be5578b082d000131e3b69caa4b637099"

RPROVIDES:${PN} += "deepin-screen-recorder"

RDEPENDS:${PN} += "byzanz \
ffmpeg \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXtst.so.6 \
libc.so.6 \
libdframeworkdbus.so.2 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.407 \
libopencv-imgproc.so.407 \
libstdc++.so.6"

inherit rpm
