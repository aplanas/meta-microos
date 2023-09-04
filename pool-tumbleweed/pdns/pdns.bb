SUMMARY = "Authoritative-only nameserver"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. Furthermore, PowerDNS \
interfaces with almost any database."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-4.8.0-1.2.aarch64.rpm"
RPM_HASH = "eb7acb1a1aaf37ac19d238801907c245539691c19c00adb51daf0e0f024b157644c046b1ea465e032d30ff125f971ae292627f9641ced3fb06b6a011449c9c6d"

RPROVIDES:${PN} += "bundled-ipcrypt \
bundled-json11 \
bundled-lmdb-safe \
bundled-luawrapper \
bundled-protozero \
bundled-yahttp \
config-pdns \
libbindbackend.so \
libpipebackend.so \
pdns"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libp11-kit.so.0 \
libsodium.so.23 \
libsqlite3.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
libyaml-cpp.so.0.8 \
pdns-common"

inherit rpm
