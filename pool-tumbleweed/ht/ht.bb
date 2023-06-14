SUMMARY = "Disassembler, object dumper and hex editor"
DESCRIPTION = "The HT editor is a file viewer, editor and analyzer for text, binary, \
and (especially) executable files. \
 \
This subpackage provides the program under its original name, 'ht', \
though texlive's tex4ht utility clashes with it, which is why the \
real program is in the 'hte' subpackage."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "ht-2.1.0-3.12.aarch64.rpm"
RPM_HASH = "8434d5e2705cf353f41f105536b97b490562cf49b25f0d4e426d38dd3ed709c7fc36e930559400a3c261c98218cdc01f4d692426d4abb291feabff0bafd01c62"

RPROVIDES:${PN} += "ht"

RDEPENDS:${PN} += "hte"

inherit rpm
