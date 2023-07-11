SUMMARY = "Remote shell that survives IP roaming and disconnect"
DESCRIPTION = "Eternal Terminal (ET) is a remote shell that automatically reconnects without \
interrupting the session."
LICENSE = "Apache-2.0"

PV = "6.2.4"

RPM_NAME = "EternalTerminal-6.2.4-3.2.aarch64.rpm"
RPM_HASH = "1353ef749c2057a669efd7f9dea4324338e81e8627ad57a639a6bc9b8b40a5d26602dde47ae2e5b562e3c6408fc1b11ab8e8bb2284f3be77d79c460c9279a53c"

RPROVIDES:${PN} += "EternalTerminal \
config-EternalTerminal"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.1.1 \
libcurl.so.4 \
libgcc-s.so.1 \
libprotobuf-lite-3.21.12.so \
libsodium.so.23 \
libssl.so.1.1 \
libstdc++.so.6 \
libutempter.so.0 \
libz.so.1 \
systemd"

inherit rpm
