SUMMARY = "Chinese Pinyin engine for fcitx"
DESCRIPTION = "Chinese Pinyin engine for Fcitx input method framework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-pinyin-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "7070b991daf6151b3b61c7a863ddb935ecdd1676e07b3063a4634174f067bf08bb1384a93076efe9acb8f910d7fbc30601b7cd854e47d6be02388582b1187fbf"

RPROVIDES:${PN} += "fcitx-pinyin"

RDEPENDS:${PN} += "fcitx \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
