SUMMARY = "Baum braille chardev support for QEMU"
DESCRIPTION = "This package contains a module for baum braille chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-chardev-baum-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "2ee0c1f174ac630542e7f6128d74c66010a2bd5a4f460ea33cb1ceddbc95995ba6a423b62355831f3fc1c6adc38e43745aef980d725e11998d307262143f8fcb"

RPROVIDES:${PN} += "qemu-chardev-baum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
