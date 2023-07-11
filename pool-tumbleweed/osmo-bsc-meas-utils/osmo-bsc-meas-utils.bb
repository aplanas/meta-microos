SUMMARY = "Command line utilities for OsmoBSC's measurement reports"
DESCRIPTION = "This package contains utilities for handling OsmoBSC's measurement reports \
 * meas_json to convert measurement feed into a JSON feed"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-meas-utils-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "1a06bc5e4163a4934cb21a041c83713d86252a37e1b5cff9bfc6250509211b546769d37c8e5ed397a28e57b8c71f237590eca5acadde9c141ef007125a633aae"

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
