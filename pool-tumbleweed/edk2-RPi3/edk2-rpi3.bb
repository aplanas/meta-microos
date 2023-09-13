SUMMARY = "Firmware required to run the RPi3"
DESCRIPTION = "Firmware required to run the RPi3"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-RPi3-0.0~20230118T162833~201514e6-3.1.aarch64.rpm"
RPM_HASH = "147a4cd3eed25a0a29c1abc32ac886f1acd715de85f66b3a43751282097379b054cf526acdbe6ab386de5fbcd268a8fed78050986fd9de4a03d15a7119eecd7f"

RPROVIDES:${PN} += "edk2-RPi3"

RDEPENDS:${PN} += ""

inherit rpm
