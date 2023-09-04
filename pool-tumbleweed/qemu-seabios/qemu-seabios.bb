SUMMARY = "x86 Legacy BIOS for QEMU"
DESCRIPTION = "SeaBIOS is an open source implementation of a 16bit x86 BIOS. SeaBIOS \
is the default and legacy BIOS for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.16.2_3_gd478f380"

RPM_NAME = "qemu-seabios-1.16.2_3_gd478f380-1.1.noarch.rpm"
RPM_HASH = "867ca5d038790a2353a1b98a774464c85343dc383ce0e143e45384db25332d8329e7bcab1d045c9cdb4b906f59940bd4c16600472621898a0fa9b7e6bba952af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-seabios"

RDEPENDS:${PN} += ""

inherit rpm
