SUMMARY = "x86 MicroVM firmware for QEMU"
DESCRIPTION = "This package provides minimal x86 firmware for booting certain guests under \
QEMU. qboot provides the minimum resources needed to boot PVH and bzImages. \
bios-microvm, created from a minimal seabios configuration, provides slightly \
wider support than qboot, but still focuses on quick boot up."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-microvm-8.0.2-2.1.noarch.rpm"
RPM_HASH = "2b6ad46b77f86142977ed58c5c84acfcaf35d850fbf770c40196362288ab5d6db686f3a779f140de1f568ba899e6c2f11bc3c87878f0781268be980141c52230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-microvm"

RDEPENDS:${PN} += ""

inherit rpm
