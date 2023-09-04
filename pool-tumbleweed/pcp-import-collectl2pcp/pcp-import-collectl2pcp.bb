SUMMARY = "Performance Co-Pilot archive tools for importing collectl data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing collectl data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-collectl2pcp-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "9cc786c5d876a6353c18ae424b63b881b843008eb69d31236e7a0dfd38fd1c366090becfc8dd3a7ceb64c64ad7644db2e12feba7a3273149e9a2c3c25c92a66a"

RPROVIDES:${PN} += "pcp-import-collectl2pcp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-import.so.1 \
libpcp.so.3"

inherit rpm
