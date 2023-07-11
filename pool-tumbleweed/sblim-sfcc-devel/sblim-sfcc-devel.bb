SUMMARY = "Development files for the Small Footprint CIM Client Library"
DESCRIPTION = "Small Footprint CIM Client Library (sfcc) Header Files and Link \
Libraries"
LICENSE = "EPL-1.0"

PV = "2.2.9~rc1"

RPM_NAME = "sblim-sfcc-devel-2.2.9~rc1-1.1.aarch64.rpm"
RPM_HASH = "d47118e45141570271832c50e623b56e71ddb633042da28d8a94c491fa1f8b5e61c2c9338b2415002b706c719d578319a7ef2a8bf2f2b99ad7fe67561d088fa6"

RPROVIDES:${PN} += "sblim-sfcc-devel"

RDEPENDS:${PN} += "glibc-devel \
libcimcClientXML0 \
libcimcclient0 \
libcmpisfcc1"

inherit rpm
