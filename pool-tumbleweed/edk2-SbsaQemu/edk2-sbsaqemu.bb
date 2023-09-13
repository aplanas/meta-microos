SUMMARY = "Firmware required to run the SbsaQemu"
DESCRIPTION = "Firmware required to run the SbsaQemu"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-SbsaQemu-0.0~20230118T162833~201514e6-3.1.aarch64.rpm"
RPM_HASH = "3d7a33491a28820df6b54ed2df77dc70325cfd281e9325075daa751d742796254d81fad1471cc6f464197bb057dbeadf36dd7b0936c8b14414924a5631d5b93a"

RPROVIDES:${PN} += "edk2-SbsaQemu"

RDEPENDS:${PN} += ""

inherit rpm
