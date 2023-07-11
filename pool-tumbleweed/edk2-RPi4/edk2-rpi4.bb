SUMMARY = "Firmware required to run the RPi4"
DESCRIPTION = "Firmware required to run the RPi4"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-RPi4-0.0~20230118T162833~201514e6-2.3.aarch64.rpm"
RPM_HASH = "f7af1467b4473f9cc14e1d83cf39cafe26615c29023a2655454d72ad36594ecd3c484c31b896e053952f5943affc1f211f759f57f004388fbc88994131b64a57"

RPROVIDES:${PN} += "edk2-RPi4"

RDEPENDS:${PN} += ""

inherit rpm
