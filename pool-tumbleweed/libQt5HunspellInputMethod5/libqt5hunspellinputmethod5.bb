SUMMARY = "Qt5 Hunspell Input Method"
DESCRIPTION = "Internal library used by Qt for providing Hunspell support."
LICENSE = "GPL-3.0"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5HunspellInputMethod5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "995f878ba332bbb65060c04c13314d15140f8c6b83e2fc2102cc9ec7206d8aff274dd968cd2bb58bf5b01d8c67002d704b8c4f09dde4a0809e4cbc3704308a16"

RPROVIDES:${PN} += "libQt5HunspellInputMethod.so.5 \
libQt5HunspellInputMethod5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5VirtualKeyboard.so.5 \
libc.so.6 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
