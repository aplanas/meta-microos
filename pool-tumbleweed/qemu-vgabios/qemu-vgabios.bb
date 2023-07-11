SUMMARY = "VGA BIOSes for QEMU"
DESCRIPTION = "VGABIOS provides the video ROM BIOSes for the following variants of VGA \
emulated devices: Std VGA, QXL, Cirrus CLGD 5446 and VMware emulated \
video card. For use with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.16.2_3_gd478f380"

RPM_NAME = "qemu-vgabios-1.16.2_3_gd478f380-2.1.noarch.rpm"
RPM_HASH = "0690d6222b34713ae7e938f1ac40e771a158bcb32e72189d85acf9efcb40fc433adb29c7c29b98539d9e873de1bfe98a5f133598c177fb631ca0ea9f77d3a56c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-vgabios"

RDEPENDS:${PN} += ""

inherit rpm
