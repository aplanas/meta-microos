SUMMARY = "Disassembler, object dumper and hex editor"
DESCRIPTION = "The HT editor is a file viewer, editor and analyzer for text, binary, \
and (especially) executable files."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "hte-2.1.0-3.12.aarch64.rpm"
RPM_HASH = "30a4b94dd3d527eb4c9f93aa4a78be268e95a7728b07bb2f1dfd1de9b304228b4c131c05c9f269b52150ea51cb89f9a6c94d8a8803dbf3d0d84171dc170ad546"

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
