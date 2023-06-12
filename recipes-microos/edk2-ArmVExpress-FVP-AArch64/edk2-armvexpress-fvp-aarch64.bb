SUMMARY = "Firmware required to run the ArmVExpress-FVP-AArch64"
DESCRIPTION = "Firmware required to run the ArmVExpress-FVP-AArch64"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-ArmVExpress-FVP-AArch64-0.0~20230118T162833~201514e6-2.1.aarch64.rpm"
RPM_HASH = "2aa2ce288464ae595c92872d3f36470c6eb6677174f64ceb87895339fa88fb0d1c03671e122f3bd1fe8fc9ae4f67197bb1fa9894533f3fb7d44d602e3c1a7fb7"

RPROVIDES:${PN} += "edk2-ArmVExpress-FVP-AArch64 \
edk2-ArmVExpress-FVP-AArch64(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
