SUMMARY = "Baum braille chardev support for QEMU"
DESCRIPTION = "This package contains a module for baum braille chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-chardev-baum-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "96353da0049d0b8d02bb02c16d2953bac6f66f793edf7963e02f659676a18d11134b66e4bc4ad3221d9f991e1fd42a7334fe2c486d35639c52e8e31b60589068"

RPROVIDES:${PN} += "qemu-chardev-baum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
