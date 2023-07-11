SUMMARY = "Firmware required to run the ArmVExpress-FVP-AArch64"
DESCRIPTION = "Firmware required to run the ArmVExpress-FVP-AArch64"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-ArmVExpress-FVP-AArch64-0.0~20230118T162833~201514e6-2.3.aarch64.rpm"
RPM_HASH = "27e97f9ecfb1401fc7ac94e43a7c5a8b343c93765afde4c85b68a03b12e5a3e1a60c623858da07d435e3ebfe57403cc389804b9e3f286720141742aff044e6ef"

RPROVIDES:${PN} += "edk2-ArmVExpress-FVP-AArch64"

RDEPENDS:${PN} += ""

inherit rpm
