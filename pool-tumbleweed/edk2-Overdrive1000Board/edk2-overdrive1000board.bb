SUMMARY = "Firmware required to run the Overdrive1000Board"
DESCRIPTION = "Firmware required to run the Overdrive1000Board"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-Overdrive1000Board-0.0~20230118T162833~201514e6-3.1.aarch64.rpm"
RPM_HASH = "e55dc501ab1357406bf346702e1647c24436e21f80fbf64d4537b5fdd74a0c90576f2ae2bfba7cf6b6a7fba9ec5a901f1ecf185741303ac3d6c8d87838b8c4f4"

RPROVIDES:${PN} += "edk2-Overdrive1000Board"

RDEPENDS:${PN} += ""

inherit rpm
