SUMMARY = "Firmware required to run the hikey960"
DESCRIPTION = "Firmware required to run the hikey960"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-hikey960-0.0~20230118T162833~201514e6-2.1.aarch64.rpm"
RPM_HASH = "21095647cee20c6df0a5203adc7de311d94e0eec06bcfc8a9660083a89d645fafa87fdf72d35f4fd48e9a4990e404f16b5144ba2f5f24c8cdb6a40902c45ab70"

RPROVIDES:${PN} += "edk2-hikey960 \
edk2-hikey960(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
