SUMMARY = "Kana-Kanji Conversion Engine"
DESCRIPTION = "Anthy is a package for an input method editor backend for Unix-like \
systems for the Japanese language. It can convert Hiragana to Kanji \
as per the language rules. As a preconversion stage, Latin characters \
(Romaji) can be used to input Hiragana. Anthy is commonly used with \
an input method framework such as ibus, fcitx or SCIM."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "9100h"

RPM_NAME = "anthy-9100h-42.1.aarch64.rpm"
RPM_HASH = "4f267ddc82fdff20c728f7fe601bbcf2f9f5ced8a641c97ba3a096cf1db8a0845c45fb2de32410fcc47cdc429cc17a7a8673ccc05057a49d3db5742e1131009e"

RPROVIDES:${PN} += "anthy \
config-anthy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libanthy.so.0 \
libanthydic.so.0 \
libanthyinput.so.0 \
libc.so.6"

inherit rpm
