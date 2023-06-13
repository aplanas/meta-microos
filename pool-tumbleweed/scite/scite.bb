SUMMARY = "Source Code Editor based on Scintilla"
DESCRIPTION = "SciTE is a SCIntilla based Text Editor. Originally built to demonstrate \
Scintilla, it has grown to be a generally useful editor with facilities for \
building and running programs."
LICENSE = "MIT"

PV = "5.3.5"

RPM_NAME = "scite-5.3.5-1.1.aarch64.rpm"
RPM_HASH = "7b31f8472de8f099cb4045107b02fb5092c9edafbd8432e211fbdcf8a104464db409384b87905212333ead1c106a7f2afd13326dc59be1d9f562bbb97aed3f01"

RPROVIDES:${PN} += "application() \
application(SciTE.desktop) \
liblexilla.so()(64bit) \
mimehandler(text/plain) \
scite \
scite(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libscintilla.so.5()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
