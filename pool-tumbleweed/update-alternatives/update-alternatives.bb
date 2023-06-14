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

PV = "1.21.8"

RPM_NAME = "update-alternatives-1.21.8-2.1.aarch64.rpm"
RPM_HASH = "d8fc3a3607b765e00c12be80ac75c3755f628ef17beb4ffe0edda5e2ca4e20779718700fa3f2d8d3459ae3cce52ca228522be1ef78d0bf10bfbb971cf8c21018"

RPROVIDES:${PN} += "alternatives \
update-alternatives"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
