SUMMARY = "Disassembler, object dumper and hex editor"
DESCRIPTION = "The HT editor is a file viewer, editor and analyzer for text, binary, \
and (especially) executable files."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "hte-2.1.0-3.13.aarch64.rpm"
RPM_HASH = "27123e53c26427904b4fdbe42222307fb451b4861180599a1b7b9ac346da0c191ba3aea90d4f3ce3e09a9bae2828cad18efcb4d0c331b61e5f31ef1de5d728aa"

RPROVIDES:${PN} += "hte"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblzo2.so.2 \
libm.so.6 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
