SUMMARY = "A source code editing component"
DESCRIPTION = "Scintilla is a code editing component. It includes features for \
editing and debugging source code, such as syntax styling, error \
indicators, code completion and call tips. The selection margin can \
contain breakpoint markers and the current line. It can use \
proportional fonts, multiple fonts and different colors at the same \
time."
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "libscintilla5-5.3.6-1.1.aarch64.rpm"
RPM_HASH = "527a9a322adeb4ebd87d7273e795ae6c534e24c12002606a2901e4c42345d002a1ffeaac4055140962d9a34c0e288700694c8e42a2d4e9f7e369c8c81afd65d4"

RPROVIDES:${PN} += "libscintilla.so.5 \
libscintilla5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
