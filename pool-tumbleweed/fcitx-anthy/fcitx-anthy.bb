SUMMARY = "Japanese Anthy IME Wrapper for Fcitx"
DESCRIPTION = "fcitx-anthy is a Japanese Anthy IME Wrapper for Fcitx. \
 \
Anthy is a system for Japanese input method. It converts Hiragana text to Kana Kanji mixed text. \
 \
Fcitx is a input method framework with extension support."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.4"

RPM_NAME = "fcitx-anthy-0.2.4-2.8.aarch64.rpm"
RPM_HASH = "e1a091deb39d4c599d9d6db150ebc458affc350824c30d7132593e35405945685eb20ac2ed2afb60620b6fa27a385b25e43607a1b242c4ac40c3d24085d0aae3"

RPROVIDES:${PN} += "fcitx-anthy"

RDEPENDS:${PN} += "/sbin/ldconfig \
anthy \
fcitx \
ld-linux-aarch64.so.1 \
libanthy.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
