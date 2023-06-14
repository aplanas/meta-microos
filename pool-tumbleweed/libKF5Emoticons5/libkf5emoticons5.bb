SUMMARY = "Emoticon to graphical emoticon text converter"
DESCRIPTION = "KEmoticons converts emoticons from text to a graphical representation with \
images in HTML. It supports setting different themes for emoticons coming \
from different providers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Emoticons5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "093c6ea86c291ee53f3c5fefebb2523a4d3b79a391e2ef1eec74e441dcde3d66cff9ab453ae0088f99c89eda086020d650bd761a662136d190a3c059eaad44e8"

RPROVIDES:${PN} += "libKF5Emoticons.so.5 \
libKF5Emoticons5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Service.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
