SUMMARY = "Japanese Anthy IME Wrapper for Fcitx"
DESCRIPTION = "fcitx-anthy is a Japanese Anthy IME Wrapper for Fcitx. \
 \
Anthy is a system for Japanese input method. It converts Hiragana text to Kana Kanji mixed text. \
 \
Fcitx is a input method framework with extension support."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.4"

RPM_NAME = "fcitx-anthy-0.2.4-2.7.aarch64.rpm"
RPM_HASH = "37c562f1b81d29407cb99a5ea8bd4e4d7aee19b16529fd2e815191fded1e4c44057c8789175a123d6a3c06144a4dc4f414d87b35cc0434f42a06e0b147e4fbb7"

RPROVIDES:${PN} += "fcitx-anthy \
fcitx-anthy(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
anthy \
fcitx \
ld-linux-aarch64.so.1()(64bit) \
libanthy.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
