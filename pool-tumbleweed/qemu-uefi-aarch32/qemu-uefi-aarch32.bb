SUMMARY = "UEFI QEMU rom image (AArch32)"
DESCRIPTION = "This package contains the UEFI rom image (AArch32) for QEMU cortex-a15 \
virt board."
LICENSE = "BSD-2-Clause-Patent"

PV = "202302"

RPM_NAME = "qemu-uefi-aarch32-202302-3.1.noarch.rpm"
RPM_HASH = "0c6d3be4f2b68da147d78b19910e721b6cca0defbef31251c7b814a8c070120d123cf495abf58c5019638ae34961a7e5b7dff86bc92580af3214f5d2a3b6a071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-uefi-aarch32"

RDEPENDS:${PN} += ""

inherit rpm
