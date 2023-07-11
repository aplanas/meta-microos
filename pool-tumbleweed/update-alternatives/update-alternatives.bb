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

RPM_NAME = "update-alternatives-1.21.8-2.2.aarch64.rpm"
RPM_HASH = "83c1cabe6072afaaab62dfe0e92f731edf98c53cff92cce244e0a6d8e7d535f16efe58adfe6421d791cecb6d93961499731cc44150c78c83f9a57b50e513875b"

RPROVIDES:${PN} += "alternatives \
update-alternatives"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
