SUMMARY = "x86 MicroVM firmware for QEMU"
DESCRIPTION = "This package provides minimal x86 firmware for booting certain guests under \
QEMU. qboot provides the minimum resources needed to boot PVH and bzImages. \
bios-microvm, created from a minimal seabios configuration, provides slightly \
wider support than qboot, but still focuses on quick boot up."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-microvm-8.0.4-1.1.noarch.rpm"
RPM_HASH = "3444c6e3c535ffe129fc63b8397ab40641f0426024091887d392659539f280450da5cad52fddeb8ca2225c47663398defbbeeadeeaabac5f4c08f4bdb85a7851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-microvm"

RDEPENDS:${PN} += ""

inherit rpm
