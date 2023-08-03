SUMMARY = "x86 Legacy BIOS for QEMU"
DESCRIPTION = "SeaBIOS is an open source implementation of a 16bit x86 BIOS. SeaBIOS \
is the default and legacy BIOS for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.16.2_3_gd478f380"

RPM_NAME = "qemu-seabios-1.16.2_3_gd478f380-2.1.noarch.rpm"
RPM_HASH = "a082b4d804a839072372209af9abfd583ad999d37ebc4d6b47499b4eb8989797ab9b12398ee3d186fe9dd3baf396d8bbea7f84038ec9106c618e5d07d301e433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-seabios"

RDEPENDS:${PN} += ""

inherit rpm
