SUMMARY = "Linux Kernel Development"
DESCRIPTION = "The 32bit pattern complementing devel_kernel."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_kernel-32bit-20170319-12.1.aarch64.rpm"
RPM_HASH = "16a9053f31a2fd1468506ab7f51809b7c09479b12fb124ed656e55f05852d21190959dcb51f9496642c9b164b7372ddc73ea7da801b92bab8f7a6a6e9f2bf3d6"

RPROVIDES:${PN} += "pattern- \
patterns-devel-base-devel-kernel-32bit"

RDEPENDS:${PN} += ""

inherit rpm
