SUMMARY = "Standalone program using libosmo-mslookup"
DESCRIPTION = "Standalone program using libosmo-mslookup to easily integrate with programs \
that want to connect services (SIP, SMS,...) to the current location of a \
subscriber."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-mslookup-client-1.4.0-1.12.aarch64.rpm"
RPM_HASH = "8c5ca77775f22ed5afd566ff79081e09352267554cad3e7d09b00b25310ea900ec8534b3df5fcb208fd50693e8f2005286eec68e2d94f128b5f4d7d225dae908"

RPROVIDES:${PN} += "osmo-mslookup-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-mslookup.so.0 \
libosmocore.so.20 \
libtalloc.so.2"

inherit rpm
