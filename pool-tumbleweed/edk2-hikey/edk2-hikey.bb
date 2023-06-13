SUMMARY = "Firmware required to run the hikey"
DESCRIPTION = "Firmware required to run the hikey"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-hikey-0.0~20230118T162833~201514e6-2.1.aarch64.rpm"
RPM_HASH = "7875baa03a67ecbbbc9f58c8e1adca2a0dba8ff71b89acbfe5c7a0cd1ba24de38b4cecbc3f4c5f679c9ac433a442a31f918a38a315e7c19e602183513879f41d"

RPROVIDES:${PN} += "edk2-hikey \
edk2-hikey(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
