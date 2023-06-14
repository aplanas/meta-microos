SUMMARY = "Video downloader"
DESCRIPTION = "A program which downloads and converts online videos from YouTube, Vimeo, \
DailyMotion, MyVideo and many other platforms."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.7"

RPM_NAME = "clipgrab-3.9.7-1.12.aarch64.rpm"
RPM_HASH = "9b81bbb7ccdbb02170152838eb5f4e8b6f4e59a4df97770e4d8f65cf59a0c2f92aa844452333d8e7fbf53d57bef00ff06b390e286d74de246eca8825bbe6400c"

RPROVIDES:${PN} += "clipgrab"

RDEPENDS:${PN} += "ffmpeg \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
