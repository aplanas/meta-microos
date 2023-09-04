SUMMARY = "Source Code Editor based on Scintilla"
DESCRIPTION = "SciTE is a SCIntilla based Text Editor. Originally built to demonstrate \
Scintilla, it has grown to be a generally useful editor with facilities for \
building and running programs."
LICENSE = "MIT"

PV = "5.3.7"

RPM_NAME = "scite-5.3.7-1.1.aarch64.rpm"
RPM_HASH = "cd0e55cc1677ddc2b4b0913210a846c95d81a25ba180a85b23243291e87408711e5c7aa856ad26bdb83076bf1fa7966d774e05a3b8bf9a53769b43e7d7bffcf9"

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
