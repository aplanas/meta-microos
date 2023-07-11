SUMMARY = "Source Code Editor based on Scintilla"
DESCRIPTION = "SciTE is a SCIntilla based Text Editor. Originally built to demonstrate \
Scintilla, it has grown to be a generally useful editor with facilities for \
building and running programs."
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "scite-5.3.6-1.1.aarch64.rpm"
RPM_HASH = "9fd528049ae881aff6ea32a970f774c987f2a98a380873c37f080f67265fe6547f094256e36fda42b755a35db2bb2382057e96374cdebb8d13004c9d3bbb5cb3"

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
