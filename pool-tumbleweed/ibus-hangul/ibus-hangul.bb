SUMMARY = "The Hangul engine for IBus input platform"
DESCRIPTION = "The Hangul engine for IBus platform. It provides Korean input method from \
libhangul."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.5"

RPM_NAME = "ibus-hangul-1.5.5-1.1.aarch64.rpm"
RPM_HASH = "a0be33a2ac1812d9d0629425e94a3f803155b3e06823013fd19b8c73da4591d2acc5f24c75aad2c9d5f1483dc007b6c3cdbb03d4998dfa3a464facff4e473ca4"

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
