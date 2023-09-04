SUMMARY = "Emoticon to graphical emoticon text converter"
DESCRIPTION = "KEmoticons converts emoticons from text to a graphical representation with \
images in HTML. It supports setting different themes for emoticons coming \
from different providers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Emoticons5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "6798118c5a74bc7989596541c39dff8ad1ddbcd8c534aab749150e31b837de63d92fbc8110d3feaaaa843a4cb407ab659db62b29c13f60f7dc08fcf6ad271c6d"

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
