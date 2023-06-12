SUMMARY = "Japanese SKK input method for ibus"
DESCRIPTION = "A Japanese Simple Kana Kanji Input Method Engine for ibus."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.3"

RPM_NAME = "ibus-skk-1.4.3-1.17.aarch64.rpm"
RPM_HASH = "130e71b288dbfd3078cd9e673604aa9ac9c9071f422e989fe5a9d44066a85f7f9fb020a19820c76a6bd2beb9f78be7c65df6ff456056866b34325b6ceca06200"

RPROVIDES:${PN} += "application() \
application(ibus-setup-skk.desktop) \
ibus-skk \
ibus-skk(aarch-64)"
RDEPENDS:${PN} += "ibus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgee-0.8.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libibus-1.0.so.5()(64bit) \
libskk.so.0()(64bit)"

inherit rpm