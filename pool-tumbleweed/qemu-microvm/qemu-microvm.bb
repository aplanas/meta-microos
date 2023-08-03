SUMMARY = "x86 MicroVM firmware for QEMU"
DESCRIPTION = "This package provides minimal x86 firmware for booting certain guests under \
QEMU. qboot provides the minimum resources needed to boot PVH and bzImages. \
bios-microvm, created from a minimal seabios configuration, provides slightly \
wider support than qboot, but still focuses on quick boot up."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-microvm-8.0.3-2.1.noarch.rpm"
RPM_HASH = "29695113c2143899f8e91123546a76843ca59ee8c1ff37898eeb777ef08f576284931d40d1013b5af7c72a4a7758b5141b6d3b96982f0b5a61a4ab9a9110500f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-microvm"

RDEPENDS:${PN} += ""

inherit rpm
