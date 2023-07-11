SUMMARY = "Open File Lister from hxtools"
DESCRIPTION = "ofl lists processes (and can send signals to them) that have \
directories or files in specific locations in use. It differs from \
lsof/fuser in that it can scan recursively and won't bluntly look at \
an entire mount."
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "ofl-20230411-1.2.aarch64.rpm"
RPM_HASH = "2ea493c75d742d7ae2bdccb552ada9ade690a1d3aa3796fbc92208f9d403dba06e698e50a1c27d08944ed98a0f67eb88c5094dc67afcdfb63cf9d950a1173005"

RPROVIDES:${PN} += "ofl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6"

inherit rpm
