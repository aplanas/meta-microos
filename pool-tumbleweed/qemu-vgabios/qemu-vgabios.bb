SUMMARY = "VGA BIOSes for QEMU"
DESCRIPTION = "VGABIOS provides the video ROM BIOSes for the following variants of VGA \
emulated devices: Std VGA, QXL, Cirrus CLGD 5446 and VMware emulated \
video card. For use with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.16.2_3_gd478f380"

RPM_NAME = "qemu-vgabios-1.16.2_3_gd478f380-1.1.noarch.rpm"
RPM_HASH = "f7b9ab2b0911f4af1ce0ab317faf575a0ead3a3d74b06ab4ff213ff8a8548e0fb9a93ccd3f98179e654f92295ea0b28ae3c93bc1719b7bd925a939225af8ed59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-vgabios"

RDEPENDS:${PN} += ""

inherit rpm
