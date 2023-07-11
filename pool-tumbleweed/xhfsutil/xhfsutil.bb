SUMMARY = "Tcl/Tk Front-End for hfsutils"
DESCRIPTION = "A Tcl interface for scriptable access to volumes and  Tk-based \
front-end for browsing and copying files through a variety of transfer \
modes (MacBinary, BinHex, text, etc.) for hfsutils."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "xhfsutil-3.2.6-1245.14.aarch64.rpm"
RPM_HASH = "073e877981a8c4173bfcb6652cbd99497576be180bb764a98f62266ccb996f391adbe018dddec20ecb1bc86009bbb68f31f94e68920d8d6a2b65720ba6ad5463"

RPROVIDES:${PN} += "xhfsutil"

RDEPENDS:${PN} += "/usr/bin/sh \
hfsutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
