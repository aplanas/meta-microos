SUMMARY = "UEFI QEMU rom image (AArch32)"
DESCRIPTION = "This package contains the UEFI rom image (AArch32) for QEMU cortex-a15 \
virt board."
LICENSE = "BSD-2-Clause-Patent"

PV = "202305"

RPM_NAME = "qemu-uefi-aarch32-202305-1.1.noarch.rpm"
RPM_HASH = "25ca6acae54fbbd91e9eecdffdbca303e10b51d0108d37c8f3a1052ebbec23d6870460c65cca7cf326d969e2d2bb2d0bb9fc659a2c2413f41fe244a928c273c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-uefi-aarch32"

RDEPENDS:${PN} += ""

inherit rpm
