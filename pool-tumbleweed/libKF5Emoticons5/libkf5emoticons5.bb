SUMMARY = "Emoticon to graphical emoticon text converter"
DESCRIPTION = "KEmoticons converts emoticons from text to a graphical representation with \
images in HTML. It supports setting different themes for emoticons coming \
from different providers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Emoticons5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "8e5c639ccf56bab46f6106047e830c7b16d88a0d2838bd9d254f9e239a1477d38991be4f818fe9260b72d0a19c95ed4187a528dfe0be81c58a347f86a6b8d112"

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
