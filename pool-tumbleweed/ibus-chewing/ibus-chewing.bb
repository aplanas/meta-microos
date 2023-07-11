SUMMARY = "The Chewing engine for IBus input platform"
DESCRIPTION = "The Chewing engine for IBus platform. It provides Chinese input method from \
libchewing. \
新酷音輸入法"
LICENSE = "GPL-2.0-or-later"

PV = "1.6.1"

RPM_NAME = "ibus-chewing-1.6.1-2.17.aarch64.rpm"
RPM_HASH = "8adb5a92bc74afa58671a1b71511613ba7e48d2fd5fe2ff7d680d5120d04f06ea01aec4e5bf58e3dcbcf1310515cbba84f9b814050ca6a07cacfae9d6fff9b4f"

RPROVIDES:${PN} += "ibus-chewing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libchewing.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libibus-1.0.so.5"

inherit rpm
