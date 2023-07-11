SUMMARY = "Japanese SKK input method for ibus"
DESCRIPTION = "A Japanese Simple Kana Kanji Input Method Engine for ibus."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.3"

RPM_NAME = "ibus-skk-1.4.3-1.18.aarch64.rpm"
RPM_HASH = "5336b67e710b8443387112c0cb607b8e51a28f37620342b5779dd0da4ad930a99ae17c23f78b4316480b25039c681744f8601e3a8bc50301ff1701089d3f1b76"

RPROVIDES:${PN} += "ibus-skk"

RDEPENDS:${PN} += "ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libibus-1.0.so.5 \
libskk.so.0"

inherit rpm
