SUMMARY = "Qt 6 HunspellInputMethod private library"
DESCRIPTION = "Internal library used by Qt for providing Hunspell support. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6HunspellInputMethod6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0b685ff5917add74138c9b9ca05c0b9d0e19403f0f107dc7ded36bc452a90dc12cc2bd766bcb6a132771f14028e685355c118ef170f78ec7f2abe47579385ce8"

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
