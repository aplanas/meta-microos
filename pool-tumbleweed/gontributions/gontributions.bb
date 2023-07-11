SUMMARY = "Open source contributions lister"
DESCRIPTION = "Open source contributions lister."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "gontributions-0.7.1-1.5.aarch64.rpm"
RPM_HASH = "264f67fe5308e9b2ffbf1e5a2bd6c9a7b012ddf5ec1e857fa5d4268a2208850bfb4d53b4fe99fee6b584c150b5328aabd0a4c8f6e263ca19a087b2420c96e78f"

RPROVIDES:${PN} += "gontributions"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
