SUMMARY = "Hangul Module for Fcitx IM Framework"
DESCRIPTION = "Fcitx-hangul is a Korean Wrapper for Fcitx IM Framework. \
It's generally an IBus hangul implementation on Fcitx."
LICENSE = "GPL-2.0-only"

PV = "0.3.1"

RPM_NAME = "fcitx-hangul-0.3.1-2.8.aarch64.rpm"
RPM_HASH = "6a783823b088ca210c7f3da214abd23f306be96c445ed8c39f5fcdd3ec0218811fbebdc9db1159b0633abbfe0083c076c872194e86ccca978d9e950f0a346fae"

RPROVIDES:${PN} += "fcitx-hangul \
fcitx-hangul(aarch-64) \
locale(fcitx:ko)"
RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
libc.so.6(GLIBC_2.17)(64bit) \
libhangul.so.1()(64bit)"

inherit rpm
