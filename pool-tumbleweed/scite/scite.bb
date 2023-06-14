SUMMARY = "Source Code Editor based on Scintilla"
DESCRIPTION = "SciTE is a SCIntilla based Text Editor. Originally built to demonstrate \
Scintilla, it has grown to be a generally useful editor with facilities for \
building and running programs."
LICENSE = "MIT"

PV = "5.3.5"

RPM_NAME = "scite-5.3.5-1.1.aarch64.rpm"
RPM_HASH = "7b31f8472de8f099cb4045107b02fb5092c9edafbd8432e211fbdcf8a104464db409384b87905212333ead1c106a7f2afd13326dc59be1d9f562bbb97aed3f01"

RPROVIDES:${PN} += "liblexilla.so \
scite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libscintilla.so.5 \
libstdc++.so.6"

inherit rpm
