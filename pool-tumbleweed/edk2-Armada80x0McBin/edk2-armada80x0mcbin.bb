SUMMARY = "Firmware required to run the Armada80x0McBin"
DESCRIPTION = "Firmware required to run the Armada80x0McBin"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-Armada80x0McBin-0.0~20230118T162833~201514e6-2.1.aarch64.rpm"
RPM_HASH = "fd6215aab9a7354ac1d4267da818d9b08f6cc9251e67d2246ccd8f960e87673b3ff0718ef390fa5f1c640ffd8b602beaae674a9b36dd6d96a10fb1ca34e89a11"

RPROVIDES:${PN} += "edk2-Armada80x0McBin \
edk2-Armada80x0McBin(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
