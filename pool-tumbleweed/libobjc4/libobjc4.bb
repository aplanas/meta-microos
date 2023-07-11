SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libobjc4-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "6a7f9655c3f0dfc711e5d1cd6b25eef515f67a6f84ca277488cbb8b2ea63f68e15668ee81ca37883bde177c9dffdaf0aa0dd118029427ff733235322101a2943"

RPROVIDES:${PN} += "libobjc.so.4 \
libobjc4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
