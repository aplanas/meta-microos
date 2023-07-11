SUMMARY = "Netwide Assembler (An x86 Assembler)"
DESCRIPTION = "NASM is a prototype general-purpose x86 assembler. It can currently output \
several binary formats, including ELF, a.out, Win32, and OS/2."
LICENSE = "BSD-2-Clause"

PV = "2.16.01"

RPM_NAME = "nasm-2.16.01-1.4.aarch64.rpm"
RPM_HASH = "eb25f4813b90c413ef19aac2275f67b41e5ec8087770fc226ddf20137f7777fbac35aae6bf41f2860e72e4f594dee9dee63089aeb1c2d586977348a51fc5714a"

RPROVIDES:${PN} += "nasm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
