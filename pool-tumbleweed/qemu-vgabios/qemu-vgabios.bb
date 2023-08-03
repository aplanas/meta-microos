SUMMARY = "VGA BIOSes for QEMU"
DESCRIPTION = "VGABIOS provides the video ROM BIOSes for the following variants of VGA \
emulated devices: Std VGA, QXL, Cirrus CLGD 5446 and VMware emulated \
video card. For use with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.16.2_3_gd478f380"

RPM_NAME = "qemu-vgabios-1.16.2_3_gd478f380-2.1.noarch.rpm"
RPM_HASH = "567b289f6e05525c5f3b0e3fe41a09f96fe656b569b1af8e3d638db799565360608c6ccb73567f236cc1d7cd1eb8ae202fcd95a76ee9cc1123915ea76ebd9cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-vgabios"

RDEPENDS:${PN} += ""

inherit rpm
