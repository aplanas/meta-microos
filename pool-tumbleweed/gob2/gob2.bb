SUMMARY = "Preprocessor to Write GObject objects"
DESCRIPTION = "GOB is a preprocessor for making GObject objects with \
inline C code so that generated files are not editted. The syntax is \
inspired by Java, yacc/bison and lex."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.20"

RPM_NAME = "gob2-2.0.20-4.20.aarch64.rpm"
RPM_HASH = "92827477a535d01e176c0511b46b5e930e5efb89f382f22da0e6016ec8a4f1733ef738bfea7800598fa42ad3b100b01a14b76b011af6503217c94cf1a43455cc"

RPROVIDES:${PN} += "gob2 \
gob2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
