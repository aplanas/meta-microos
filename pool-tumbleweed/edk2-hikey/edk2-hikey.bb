SUMMARY = "Firmware required to run the hikey"
DESCRIPTION = "Firmware required to run the hikey"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-hikey-0.0~20230118T162833~201514e6-2.2.aarch64.rpm"
RPM_HASH = "de6bcbfb4b0e10797a6b1f56f94c9fd8af2761215218c06347bbe0a5eb2e7c5991fd5d7ea430e600fd680d6485e337b643c5d18ccb178f125e5a72237cc0b666"

RPROVIDES:${PN} += "edk2-hikey"

RDEPENDS:${PN} += ""

inherit rpm
