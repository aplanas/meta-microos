SUMMARY = "Firmware required to run the hikey960"
DESCRIPTION = "Firmware required to run the hikey960"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-hikey960-0.0~20230118T162833~201514e6-3.1.aarch64.rpm"
RPM_HASH = "811bbfde52e43886119602be56ec1159ce1dca569964b8fb137d56292a210ef06ad7b22b8773e6874a62489dbb159892cc2d3f6595cb8c07906beaca5f82c9bb"

RPROVIDES:${PN} += "edk2-hikey960"

RDEPENDS:${PN} += ""

inherit rpm
