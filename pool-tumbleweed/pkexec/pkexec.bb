SUMMARY = "Pkexec component of polkit"
DESCRIPTION = "This package contains the pkexec setuid root binary part of polkit."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "pkexec-121-4.3.aarch64.rpm"
RPM_HASH = "4d7e309f9142e6f64a4ddb972581627b0df4d3098d90bcb6a09e7cf3aab5d6ca43dfc20008efec0d8c9f82575a28328f06216b2f1bc2dafd6597276864a6d501"

RPROVIDES:${PN} += "pkexec \
polkit-/usr/bin/pkexec"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpam.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
permissions \
polkit"

inherit rpm
