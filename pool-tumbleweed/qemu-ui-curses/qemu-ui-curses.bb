SUMMARY = "Curses based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing curses based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ui-curses-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "01b96945fef4df7643a6cd744838fdcfae998acdd2706a6f82dca6fd6b4234a8532207fcc2706af1309481df102726b4f16a420ea7a0672e95dd918adfd2d8eb"

RPROVIDES:${PN} += "qemu-ui-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
