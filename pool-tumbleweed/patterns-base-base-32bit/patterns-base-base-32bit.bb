SUMMARY = "Base System"
DESCRIPTION = "The 32bit pattern complementing base."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-base-32bit-20200505-41.1.aarch64.rpm"
RPM_HASH = "eb844692a80394c25f81b3a14623c4b8129e5c7a1ed10971c96f6a9a70cdcae78ddcd3036bea15ac636d7b1a975054936611458bc3b312ec5ea92d6cf6777e05"

RPROVIDES:${PN} += "pattern- \
patterns-base-base-32bit"

RDEPENDS:${PN} += ""

inherit rpm
