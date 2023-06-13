SUMMARY = "The common files for the Syncplay client and server"
DESCRIPTION = "The common files for the Syncplay client and server"
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "syncplay-common-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "753f2e5a925f676efb9eb6067254dbe647d9d106fff214708233c63ea5b8ed2cae6fdb52a742402c81a5aabf132755838ba25080b611f2a47543f1e33c1a7af6"

RPROVIDES:${PN} += "syncplay-common \
syncplay-common(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
