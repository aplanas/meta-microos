SUMMARY = "Firmware required to run the hikey"
DESCRIPTION = "Firmware required to run the hikey"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-hikey-0.0~20230118T162833~201514e6-3.1.aarch64.rpm"
RPM_HASH = "5cb143f8a677b7501f223ece2a863def058e5ea31a44a267beca222dec814d0b3b26771cc1fd97082e2558a7fd9e1a486a7daf4e8c0d0641c8eb95a1ddbdb130"

RPROVIDES:${PN} += "edk2-hikey"

RDEPENDS:${PN} += ""

inherit rpm
