SUMMARY = "Osmocom Home Location Register for GSUP protocol towards OsmoSGSN and OsmoCSCN"
DESCRIPTION = "The GSUP HLR is a stand-alone HLR (Home Location Register) for SIM \
and USIM based subscribers which exposes the GSUP protocol towards \
its users. OsmoSGSN supports this protocol. \
 \
osmo-gsup-hlr is still very simplistic. It is a single-threaded \
architecture and uses only sqlite3 tables as back-end.  It is suitable \
for installations of the scale that OsmoNITB was able to handle.  It \
also lacks various features like fine-grained control of subscribed \
services (like supplementary services)."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-hlr-1.4.0-1.12.aarch64.rpm"
RPM_HASH = "a59d27422b994b178ae2f853cf0ebecee2f3df72e870e4230cfba2a8485688d1509350eee03ce6e415a71d276abbfeb1f4fed8d6fa9ae605bef3485b967f2f63"

RPROVIDES:${PN} += "config-osmo-hlr \
osmo-hlr"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi-drivers-dbd-sqlite3 \
libosmo-gsup-client.so.0 \
libosmo-mslookup.so.0 \
libosmoabis.so.10 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmogsm.so.18 \
libosmovty.so.9 \
libsqlite3.so.0 \
libtalloc.so.2"

inherit rpm
