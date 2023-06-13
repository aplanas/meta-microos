SUMMARY = "x86 Legacy BIOS for QEMU"
DESCRIPTION = "SeaBIOS is an open source implementation of a 16bit x86 BIOS. SeaBIOS \
is the default and legacy BIOS for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.16.2_3_gd478f380"

RPM_NAME = "qemu-seabios-1.16.2_3_gd478f380-1.1.noarch.rpm"
RPM_HASH = "b59c46a0acd95f317f25e8aaf6feb01e9c8b4c7e9d300c4d6466ee3c63546c55f7290fadfa473b106b2a88c89de193d8caf6afe0f95b3d9c84cf448c5a6a3c73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-seabios"

RDEPENDS:${PN} += ""

inherit rpm
