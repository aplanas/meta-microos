SUMMARY = "Kana-Kanji Conversion Engine"
DESCRIPTION = "Anthy is a package for an input method editor backend for Unix-like \
systems for the Japanese language. It can convert Hiragana to Kanji \
as per the language rules. As a preconversion stage, Latin characters \
(Romaji) can be used to input Hiragana. Anthy is commonly used with \
an input method framework such as ibus, fcitx or SCIM."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "9100h"

RPM_NAME = "anthy-9100h-41.10.aarch64.rpm"
RPM_HASH = "95204d3c0f049181b8f50679e0e047b7e6672efb8dcd4d13006c1035c9b598a3d39de63ab5859a639893d47e8e3febd2a33efd007ba5c89cb6d00c05aeede415"

RPROVIDES:${PN} += "anthy \
config-anthy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libanthy.so.0 \
libanthydic.so.0 \
libanthyinput.so.0 \
libc.so.6"

inherit rpm
