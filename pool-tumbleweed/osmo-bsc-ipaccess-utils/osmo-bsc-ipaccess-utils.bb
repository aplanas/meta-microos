SUMMARY = "Command line utilities for ip.access nanoBTS"
DESCRIPTION = "This package contains utilities that are specific for nanoBTS when being \
used together with OpenBSC. It contains mainly two tools: ipaccess-config \
and ipaccess-proxy."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-ipaccess-utils-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "41f8fa89610b427ad378f63d1d3d9ab0b827d8d6a2f338e672def8ca9d29f91be98ac4513c7d0ac337422bd4743ab75ee2a9794ec1e689dd6d7c485447f2a714"

RPROVIDES:${PN} += "osmo-bsc-ipaccess-utils"

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
