SUMMARY = "x86 Legacy BIOS for QEMU"
DESCRIPTION = "SeaBIOS is an open source implementation of a 16bit x86 BIOS. SeaBIOS \
is the default and legacy BIOS for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.16.2_3_gd478f380"

RPM_NAME = "qemu-seabios-1.16.2_3_gd478f380-2.1.noarch.rpm"
RPM_HASH = "aa38e18586165cb087adc7ffeba15b6a7fa6625d23aa29525531f17c4c3766ba4e80eb2757926baca50ac31e90d51824ccbaf18475235ecd4a7e23aced8a657a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-seabios"

RDEPENDS:${PN} += ""

inherit rpm
