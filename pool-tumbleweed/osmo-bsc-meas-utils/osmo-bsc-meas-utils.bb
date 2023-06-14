SUMMARY = "Command line utilities for OsmoBSC's measurement reports"
DESCRIPTION = "This package contains utilities for handling OsmoBSC's measurement reports \
 * meas_json to convert measurement feed into a JSON feed"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-meas-utils-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "35a9143d6ea3b7e1f03e93a85a27be84ff20ec8d739d7bc9bed2dd391ec7503aa3c66834977d3df14950574821ccc5c7b35697020c6bb34fa9e5666b5cf449cf"

RPROVIDES:${PN} += "osmo-bsc-meas-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-mgcp-client.so.9 \
libosmo-sigtran.so.7 \
libosmoabis.so.10 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmonetif.so.11 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
