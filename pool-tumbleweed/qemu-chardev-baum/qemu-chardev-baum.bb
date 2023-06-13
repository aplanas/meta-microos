SUMMARY = "Baum braille chardev support for QEMU"
DESCRIPTION = "This package contains a module for baum braille chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-chardev-baum-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "8ebf712cff1f5c93cd84a44859fdd5d6281cabbd97f11c749e2329ee17791f8429446be5858eb39154e77249d8cdccbee17bffa3572f1cdae0f72d27f632ea74"

RPROVIDES:${PN} += "qemu-chardev-baum \
qemu-chardev-baum(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbrlapi.so.0.8()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
