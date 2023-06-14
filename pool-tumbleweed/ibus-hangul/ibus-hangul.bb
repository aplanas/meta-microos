SUMMARY = "The Hangul engine for IBus input platform"
DESCRIPTION = "The Hangul engine for IBus platform. It provides Korean input method from \
libhangul."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "ibus-hangul-1.5.4-2.11.aarch64.rpm"
RPM_HASH = "b05964c3deadb662d28838dcaabcba85843bfbdc0e892e69c80a5c0f78a7a8fcf3ba548746fa58f2029852215e2559ab58670723c90792113047e8043d42ae4f"

RPROVIDES:${PN} += "ibus-hangul \
locale-ibus-ko"

RDEPENDS:${PN} += "/bin/sh \
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
