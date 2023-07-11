SUMMARY = "Disassembler, object dumper and hex editor"
DESCRIPTION = "The HT editor is a file viewer, editor and analyzer for text, binary, \
and (especially) executable files. \
 \
This subpackage provides the program under its original name, 'ht', \
though texlive's tex4ht utility clashes with it, which is why the \
real program is in the 'hte' subpackage."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "ht-2.1.0-3.13.aarch64.rpm"
RPM_HASH = "ed9d98bb14fe38c663c475bc3d0001d5d9e0cb230065052ecf774c1e81f3bd778978d827777873944bc61ef4d30aabb8f23b3faf1ab757bce757545c9f8e6132"

RPROVIDES:${PN} += "ht"

RDEPENDS:${PN} += "hte"

inherit rpm
