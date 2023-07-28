SUMMARY = "x86 MicroVM firmware for QEMU"
DESCRIPTION = "This package provides minimal x86 firmware for booting certain guests under \
QEMU. qboot provides the minimum resources needed to boot PVH and bzImages. \
bios-microvm, created from a minimal seabios configuration, provides slightly \
wider support than qboot, but still focuses on quick boot up."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-microvm-8.0.3-1.1.noarch.rpm"
RPM_HASH = "453c3fb87789d649cd926103bdc36a98bd3c6fb2a5fe4d84ecb00440ce4902ecd00f4454689a161591d6caa58aeeef07e68a06b2d3d311c71ee7975828363c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-microvm"

RDEPENDS:${PN} += ""

inherit rpm
