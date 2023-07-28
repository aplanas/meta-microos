SUMMARY = "x86 Legacy BIOS for QEMU"
DESCRIPTION = "SeaBIOS is an open source implementation of a 16bit x86 BIOS. SeaBIOS \
is the default and legacy BIOS for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.16.2_3_gd478f380"

RPM_NAME = "qemu-seabios-1.16.2_3_gd478f380-1.1.noarch.rpm"
RPM_HASH = "566e1c4e3160a0481169557da8570e54c95edced4661b2960510f2c0e3c09812cb97b57b9626a6371fe55da06b90f09fc5a8ef34ed621e743de731d518d70329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-seabios"

RDEPENDS:${PN} += ""

inherit rpm
