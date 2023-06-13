SUMMARY = "Binary bootloader and firmware files for Banana Pi R2"
DESCRIPTION = "Binary bootloader and firmware files for Banana Pi R2"
LICENSE = "SUSE-Firmware"

PV = "0.0~git20201119.b0a0872"

RPM_NAME = "bananapir2-firmware-0.0~git20201119.b0a0872-1.8.noarch.rpm"
RPM_HASH = "05c8366fae63e9d78ef6f1144778a2e3269ddb1d67fbdecb3f595d276faaae09179e4f4c16796c848ce7971e28a4bc2f200027e1d789411dc5e28cdd9a8765c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bananapir2-firmware"

RDEPENDS:${PN} += ""

inherit rpm
