SUMMARY = "Qt 6 HunspellInputMethod private library"
DESCRIPTION = "Internal library used by Qt for providing Hunspell support. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6HunspellInputMethod6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "04a58dda70b425366bb86666468ef24ad3009590b7f498e781cb8cd56885f1c2fd1ec5f3b1b5c62f457d2d9bf6cd71a7b20d5eab1d35d226f6d780bc0e78566b"

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
