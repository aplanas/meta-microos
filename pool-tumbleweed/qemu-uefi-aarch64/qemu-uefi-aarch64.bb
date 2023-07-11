SUMMARY = "UEFI QEMU rom image (AArch64)"
DESCRIPTION = "This package contains the UEFI rom image (AArch64) for QEMU cortex-a57 \
virt board."
LICENSE = "BSD-2-Clause-Patent"

PV = "202302"

RPM_NAME = "qemu-uefi-aarch64-202302-3.1.noarch.rpm"
RPM_HASH = "c2508fb3db575f33624298bd9b74aae9e5c3540ed06acfa2a974654f361bffd0699dc4f86c4b6e46e033927cf7e4394f87255a63e4cffc2816f3f2d5414e31d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-uefi-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
