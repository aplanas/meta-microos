SUMMARY = "Firmware required to run the hikey960"
DESCRIPTION = "Firmware required to run the hikey960"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-hikey960-0.0~20230118T162833~201514e6-2.3.aarch64.rpm"
RPM_HASH = "e4c7e588c2b8ea3723271ba9427e70c8be450b03e18e8004566742b62be1f8e872e0fe67434ac2f824d7a4419f38a05767cd9c263e74cf11cd7eda62edd44655"

RPROVIDES:${PN} += "edk2-hikey960"

RDEPENDS:${PN} += ""

inherit rpm
