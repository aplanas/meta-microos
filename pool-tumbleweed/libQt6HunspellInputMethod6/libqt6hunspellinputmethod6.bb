SUMMARY = "Qt 6 HunspellInputMethod private library"
DESCRIPTION = "Internal library used by Qt for providing Hunspell support. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6HunspellInputMethod6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "af361aafae90fe15fd09d40486538605533b8c893e44867822b0f9b412c8895af1b7cd36eb81b75caf7eefb9afcaf249476cf1b152370c2e28d2ad6916a9ac5b"

RPROVIDES:${PN} += "libQt6HunspellInputMethod.so.6 \
libQt6HunspellInputMethod6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6VirtualKeyboard.so.6 \
libc.so.6 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
