SUMMARY = "The Hangul engine for IBus input platform"
DESCRIPTION = "The Hangul engine for IBus platform. It provides Korean input method from \
libhangul."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "ibus-hangul-1.5.4-2.12.aarch64.rpm"
RPM_HASH = "1d10cd859482deff3ac69e39f8af85cbc5038973eb905f9fbe327d65e03bc12931d70fa04c3b68f226e62f9e91d9d3822cd4fc09792d2296c298f0fc5d85006d"

RPROVIDES:${PN} += "ibus-hangul \
locale-ibus-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libhangul.so.1 \
libibus-1.0.so.5 \
python3-gobject \
scalable-font-ko"

inherit rpm
