SUMMARY = "UEFI QEMU rom image (AArch32)"
DESCRIPTION = "This package contains the UEFI rom image (AArch32) for QEMU cortex-a15 \
virt board."
LICENSE = "BSD-2-Clause-Patent"

PV = "202302"

RPM_NAME = "qemu-uefi-aarch32-202302-2.2.noarch.rpm"
RPM_HASH = "77c38ba95c958df23f82b277f93c98d5096567fa3ebc1f83f137b9274f1295d4b666e1f39dc501cbc0b625ab83ebf01d6d8fbd78b7116550e36b61444e5eae47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-uefi-aarch32"

RDEPENDS:${PN} += ""

inherit rpm
