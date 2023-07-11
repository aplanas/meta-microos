SUMMARY = "Performance Co-Pilot archive tools for importing collectl data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing collectl data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-collectl2pcp-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "49c6c07bdd6efef4ded7d68493404320b7de6e40e6860cccc390d8c24833bd08e80df6c2b7d417560a1caf91969587ed62b527631403db7778fc12964689d509"

RPROVIDES:${PN} += "pcp-import-collectl2pcp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-import.so.1 \
libpcp.so.3"

inherit rpm
