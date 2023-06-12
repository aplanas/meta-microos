SUMMARY = "A source code editing component"
DESCRIPTION = "Scintilla is a code editing component. It includes features for \
editing and debugging source code, such as syntax styling, error \
indicators, code completion and call tips. The selection margin can \
contain breakpoint markers and the current line. It can use \
proportional fonts, multiple fonts and different colors at the same \
time."
LICENSE = "MIT"

PV = "5.3.4"

RPM_NAME = "libscintilla5-5.3.4-1.1.aarch64.rpm"
RPM_HASH = "c0e9c132f17f0fa81c02f871c124ed93d5a4eff874b93fe46268a408de7c79002162ba2136a0d930c3751d80763dbdbb07e5a39e92a9517eafb7cd8954905679"

RPROVIDES:${PN} += "libscintilla.so.5()(64bit) \
libscintilla5 \
libscintilla5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit)"

inherit rpm