SUMMARY = "VGA BIOSes for QEMU"
DESCRIPTION = "VGABIOS provides the video ROM BIOSes for the following variants of VGA \
emulated devices: Std VGA, QXL, Cirrus CLGD 5446 and VMware emulated \
video card. For use with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.16.2_3_gd478f380"

RPM_NAME = "qemu-vgabios-1.16.2_3_gd478f380-1.1.noarch.rpm"
RPM_HASH = "5608685b4d35b3944a236ee60b5167a8e088ca39636a2ecf6eba790683915a391c6091af60b1eeae972ba1f4aad1511b916077863758fe0966a5f3914f15e0b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-vgabios"

RDEPENDS:${PN} += ""

inherit rpm
