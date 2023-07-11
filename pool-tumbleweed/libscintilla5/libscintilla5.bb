SUMMARY = "A source code editing component"
DESCRIPTION = "Scintilla is a code editing component. It includes features for \
editing and debugging source code, such as syntax styling, error \
indicators, code completion and call tips. The selection margin can \
contain breakpoint markers and the current line. It can use \
proportional fonts, multiple fonts and different colors at the same \
time."
LICENSE = "MIT"

PV = "5.3.5"

RPM_NAME = "libscintilla5-5.3.5-1.1.aarch64.rpm"
RPM_HASH = "b848e9f2643138820b6d4380214182ca3b5c258589b4730f1e96889039905a4afd3061557a2d76d080d8e9a041f85300ded2e5805b9ce2ba23d8fcf45021e1d4"

RPROVIDES:${PN} += "libscintilla.so.5 \
libscintilla5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
