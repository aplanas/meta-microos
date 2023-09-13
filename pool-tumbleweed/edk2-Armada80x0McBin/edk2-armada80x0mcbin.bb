SUMMARY = "Firmware required to run the Armada80x0McBin"
DESCRIPTION = "Firmware required to run the Armada80x0McBin"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-Armada80x0McBin-0.0~20230118T162833~201514e6-3.1.aarch64.rpm"
RPM_HASH = "de5c82c4c7f86ae6972aec98b18b4cdba9619ce09b772f303a56394cb4bbca2fed4b87467641acfebe68bf5280e8c92fe16f3ed711f465a579328aea55a9bd15"

RPROVIDES:${PN} += "edk2-Armada80x0McBin"

RDEPENDS:${PN} += ""

inherit rpm
