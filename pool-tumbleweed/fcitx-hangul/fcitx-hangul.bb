SUMMARY = "Hangul Module for Fcitx IM Framework"
DESCRIPTION = "Fcitx-hangul is a Korean Wrapper for Fcitx IM Framework. \
It's generally an IBus hangul implementation on Fcitx."
LICENSE = "GPL-2.0-only"

PV = "0.3.1"

RPM_NAME = "fcitx-hangul-0.3.1-2.9.aarch64.rpm"
RPM_HASH = "79a60903dee9477d4f11f3f9b05d5e2ea43ca2f96fccf92dd03742bb92422a17f305a8347c4e721cb432a98609ee764b0ec78f9ff9b68daf1ba9c1db59988fc7"

RPROVIDES:${PN} += "fcitx-hangul \
locale-fcitx-ko"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
libc.so.6 \
libhangul.so.1"

inherit rpm
