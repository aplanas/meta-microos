SUMMARY = "Utility for creating Czech or Slovak Sorted LaTeX Index Files"
DESCRIPTION = "This program creates Czech and Slovak sorted index files for LaTeX. \
Usage: csindex -z il2 file.idx Creates file.ind - a sorted index file. \
Uses the ISO 8859-2 encoding."
LICENSE = "MakeIndex"

PV = "19980713"

RPM_NAME = "csindex-19980713-678.28.aarch64.rpm"
RPM_HASH = "67a82fdb8137fd97f556954a8b42f30408fe5bebb4fb93b7bc30faf6381aa02b8961475ff0e6dcc7620726a54419ef0383e760e164259ec194d6330ea7a37148"

RPROVIDES:${PN} += "csindex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
