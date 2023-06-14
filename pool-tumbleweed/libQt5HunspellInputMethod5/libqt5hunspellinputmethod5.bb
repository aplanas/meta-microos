SUMMARY = "Qt5 Hunspell Input Method"
DESCRIPTION = "Internal library used by Qt for providing Hunspell support."
LICENSE = "GPL-3.0"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5HunspellInputMethod5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "2e915a495d7121fdfdd100b17cb494e300cbb962303f3be79bea019a1ebd035d7cc6a58923457b39258ba3bd76a148a2ce62f0d0ced8ecb130af8934ab4da074"

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
