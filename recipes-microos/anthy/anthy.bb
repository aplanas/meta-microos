SUMMARY = "Kana-Kanji Conversion Engine"
DESCRIPTION = "Anthy is a package for an input method editor backend for Unix-like \
systems for the Japanese language. It can convert Hiragana to Kanji \
as per the language rules. As a preconversion stage, Latin characters \
(Romaji) can be used to input Hiragana. Anthy is commonly used with \
an input method framework such as ibus, fcitx or SCIM."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "9100h"

RPM_NAME = "anthy-9100h-41.9.aarch64.rpm"
RPM_HASH = "73be5b803529b05ea85d9d840b423ac3428ba1dcf17f8887bc8a19c85efb46e0bc60888af803e5d9c445df1295d5acdf2a8a5b91f2c177973836b4ae42255ca7"

RPROVIDES:${PN} += "anthy anthy(aarch-64) config(anthy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libanthy.so.0()(64bit) libanthydic.so.0()(64bit) libanthyinput.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
