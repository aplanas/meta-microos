SUMMARY = "Firmware required to run the SbsaQemu"
DESCRIPTION = "Firmware required to run the SbsaQemu"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-SbsaQemu-0.0~20230118T162833~201514e6-2.1.aarch64.rpm"
RPM_HASH = "f357ddb388c08b276c0c1be6f0cc906b604d2af46fa923b62b326b5f1496304a5ef1e28848357c0350db3781ec359b5f16e0905c160bde3b2d37c37e9845f7b6"

RPROVIDES:${PN} += "edk2-SbsaQemu \
edk2-SbsaQemu(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
