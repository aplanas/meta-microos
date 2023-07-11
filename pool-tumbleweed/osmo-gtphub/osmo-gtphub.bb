SUMMARY = "Osmocom GTP Hub: Proxy for GTP traffic between multiple SGSNs and GGSNs"
DESCRIPTION = "Osmocom GTP Hub: Proxy for GTP traffic between multiple SGSNs and GGSNs."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-gtphub-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "35da71c3aa3ae8abf0242330e843a976b8f95835fe33685e608c8c2a56d6db09237852374a22ce6fe7184fbde1261bc5e1437ea328675fd3cc69d4754fed423f"

RPROVIDES:${PN} += "config-osmo-gtphub \
osmo-gtphub"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libgtp.so.6 \
libosmo-sigtran.so.7 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
