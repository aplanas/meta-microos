SUMMARY = "Firmware required to run the ArmVExpress-FVP-AArch64"
DESCRIPTION = "Firmware required to run the ArmVExpress-FVP-AArch64"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-ArmVExpress-FVP-AArch64-0.0~20230118T162833~201514e6-3.1.aarch64.rpm"
RPM_HASH = "f3451b442bb466d8f5c997888e9fc738c46728b75ccb4da224c3b23749315a5bfb64cad1b73ad03bf0de6e7df045913d260962a0e1f2475eb9d4c99a57e56f14"

RPROVIDES:${PN} += "edk2-ArmVExpress-FVP-AArch64"

RDEPENDS:${PN} += ""

inherit rpm
