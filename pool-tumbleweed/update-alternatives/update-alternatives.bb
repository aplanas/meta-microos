SUMMARY = "Maintain symbolic links determining default commands"
DESCRIPTION = "update-alternatives creates, removes, maintains and displays \
information about the symbolic links comprising the alternatives \
system. It is possible for several programs fulfilling the same or \
similar functions to be installed on a single system at the same time. \
For example, many systems have several text editors installed at once. \
This gives choice to the users of a system, allowing each to use a \
different editor, if desired, but makes it difficult for a program to \
make a good choice of editor to invoke if the user has not specified a \
particular preference."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.22"

RPM_NAME = "update-alternatives-1.21.22-1.1.aarch64.rpm"
RPM_HASH = "cb03cda9146bd37aa85cfabf3da6b83e0b4933f56c0a3598465dc49ca9ee03dec79f823f82922e36755496e5a207d2a31a889acf01cf7674ef6865252c72d1ae"

RPROVIDES:${PN} += "alternatives \
update-alternatives"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
