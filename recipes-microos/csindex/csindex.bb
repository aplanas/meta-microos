SUMMARY = "Utility for creating Czech or Slovak Sorted LaTeX Index Files"
DESCRIPTION = "This program creates Czech and Slovak sorted index files for LaTeX. \
Usage: csindex -z il2 file.idx Creates file.ind - a sorted index file. \
Uses the ISO 8859-2 encoding."
LICENSE = "MakeIndex"

PV = "19980713"

RPM_NAME = "csindex-19980713-678.27.aarch64.rpm"
RPM_HASH = "9f6ebf4f2805cb440fb6586abfe7f0a3afdd8c13d85cd78392fb016d03a1f785c036dbb4c821ac1d08ccd0577f7f9d8062291d5092fc8c56d82239202915250b"

RPROVIDES:${PN} += "csindex \
csindex(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
