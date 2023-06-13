SUMMARY = "Development files for the Small Footprint CIM Client Library"
DESCRIPTION = "Small Footprint CIM Client Library (sfcc) Header Files and Link \
Libraries"
LICENSE = "EPL-1.0"

PV = "2.2.8"

RPM_NAME = "sblim-sfcc-devel-2.2.8-1.23.aarch64.rpm"
RPM_HASH = "1ee2eef0fc20d368cdfeb1bb68b548b055653db561cad282dc3c16859b30c13da69444b5829e2b31e16adac1436a36bd2ef528cfcb238b835bf175188e354df6"

RPROVIDES:${PN} += "sblim-sfcc-devel \
sblim-sfcc-devel(aarch-64)"

RDEPENDS:${PN} += "glibc-devel \
libcimcClientXML0 \
libcimcclient0 \
libcmpisfcc1"

inherit rpm
