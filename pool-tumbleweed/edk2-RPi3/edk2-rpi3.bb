SUMMARY = "Firmware required to run the RPi3"
DESCRIPTION = "Firmware required to run the RPi3"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-RPi3-0.0~20230118T162833~201514e6-2.3.aarch64.rpm"
RPM_HASH = "40f2a7fd9ee980ae534193b076d64ae534d170ec03fc35d8b3a11b79944a6f2bbc6658cf514f51e5bc8d84fd406042c23f17ee22a592f30b29c0bbafbad6c8cd"

RPROVIDES:${PN} += "edk2-RPi3"

RDEPENDS:${PN} += ""

inherit rpm
