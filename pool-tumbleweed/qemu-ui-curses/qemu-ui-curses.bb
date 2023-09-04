SUMMARY = "Curses based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing curses based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-ui-curses-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "7f615e3cb19a7c3eee03abada993f15cc24154bcfa8c42ab37a2845c43f82aefb31aa5f07865c66572192b21ea792a15c083421eed9992535894c983f36fb136"

RPROVIDES:${PN} += "qemu-ui-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
