SUMMARY = "Emoticon to graphical emoticon text converter"
DESCRIPTION = "KEmoticons converts emoticons from text to a graphical representation with \
images in HTML. It supports setting different themes for emoticons coming \
from different providers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Emoticons5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "be579188489b141d90c319a5a087be3d15a21830ff9b0880e4197fdcbbd7c964b346d291fe6b6df65bb644b5cb93f64b438fb8a4ed2be1685756f2de72b1ced7"

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
