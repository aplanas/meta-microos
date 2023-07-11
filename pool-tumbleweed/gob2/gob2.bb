SUMMARY = "Preprocessor to Write GObject objects"
DESCRIPTION = "GOB is a preprocessor for making GObject objects with \
inline C code so that generated files are not editted. The syntax is \
inspired by Java, yacc/bison and lex."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.20"

RPM_NAME = "gob2-2.0.20-4.21.aarch64.rpm"
RPM_HASH = "070ede244606144a1fe8567e054d6fe0b863b7a76daf6b738006f3bd0a5ab67e3ff4a678edd9434febb4ae2c5a221466c236a5a9c6405a9d60be412f17b19e75"

RPROVIDES:${PN} += "gob2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
