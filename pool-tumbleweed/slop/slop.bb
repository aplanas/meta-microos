SUMMARY = "Tool to query for a screen region selection"
DESCRIPTION = "slop (Select Operation) queries for a selection from the user and prints \
the region to stdout. It grabs the mouse and turns it into a crosshair, \
lets the user click and drag to make a selection (or click on a window) \
while drawing a pretty box around it, then finally prints the selection's \
dimensions to stdout."
LICENSE = "GPL-3.0-or-later"

PV = "7.6"

RPM_NAME = "slop-7.6-2.7.aarch64.rpm"
RPM_HASH = "451777bbe2ba9dce9d96a5c00cf62196e7d202cade3d8247f1fc4225934c43fdcec4fb5d7297af3fa06ee6eb823574e83c27ce4aff6c251f726c4931a0821304"

RPROVIDES:${PN} += "slop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libslopy.so.7.6 \
libstdc++.so.6"

inherit rpm
