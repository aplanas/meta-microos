SUMMARY = "Core library to handle text emoticons"
DESCRIPTION = "This package provides a library used to manipulate emoticons in text."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libKF5TextEmoticonsCore1-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "3eaf606375f468ca0718a3e37dc70a0a6734a6f6bd3a27e444f5e0baf6a7bca0175fc94b14f47aacac8b2d70096ecac3759b3c04c2ca0ccb248ddbc53ea26cf3"

RPROVIDES:${PN} += "libKF5TextEmoticonsCore.so.1 \
libKF5TextEmoticonsCore1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
