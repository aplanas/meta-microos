SUMMARY = "Fast Lexical Analyzer Generator"
DESCRIPTION = "FLEX is a tool for generating scanners: programs that recognize lexical \
patterns in text."
LICENSE = "BSD-3-Clause"

PV = "2.6.4"

RPM_NAME = "flex-2.6.4-6.21.aarch64.rpm"
RPM_HASH = "71c07771c72d636d8d734b7717eb6a4d7c5b100ff2cf54286ea6f6ee211fb83efc091ae96c5ee5d36b307df328aef548fb1eef10a2af4460eaeee8b1b16a1df9"

RPROVIDES:${PN} += "flex"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfl-devel \
libm.so.6 \
m4"

inherit rpm
