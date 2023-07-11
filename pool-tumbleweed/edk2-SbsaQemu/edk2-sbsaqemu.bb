SUMMARY = "Firmware required to run the SbsaQemu"
DESCRIPTION = "Firmware required to run the SbsaQemu"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-SbsaQemu-0.0~20230118T162833~201514e6-2.3.aarch64.rpm"
RPM_HASH = "d3f42469e02c995e7ad34fc9758cd331fff353d7bfba4fedd63ecba0b4c3e1934ae5845ae117d7b2457116899b97e0528abb3788640de1cd52a7b51676d3aaaf"

RPROVIDES:${PN} += "edk2-SbsaQemu"

RDEPENDS:${PN} += ""

inherit rpm
