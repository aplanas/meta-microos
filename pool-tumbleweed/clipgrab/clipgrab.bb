SUMMARY = "Video downloader"
DESCRIPTION = "A program which downloads and converts online videos from YouTube, Vimeo, \
DailyMotion, MyVideo and many other platforms."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.7"

RPM_NAME = "clipgrab-3.9.7-1.13.aarch64.rpm"
RPM_HASH = "a4c2eed47c949f5d4f521ded663f3ace6e90e835fbcd7356a976293414c2554684289297d01a0139611953bd315e30381de06714d673ac018b58612db898a6ef"

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
