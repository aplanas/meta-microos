SUMMARY = "Fuzzyclock Applet"
DESCRIPTION = "This applet shows the time in a Fuzzy Way."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-fuzzyclock-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "b4851e3ee10c1caf571e34fb5b9d18232643060400cb19087398a2e58e5e1143381f51f729a59983f64ab272250a4350676438ec4c2fd658996bc848e8a4baf4"

RPROVIDES:${PN} += "budgie-fuzzyclock-applet \
libfuzzyclock.so"

RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
