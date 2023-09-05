SUMMARY = "Remote shell that survives IP roaming and disconnect"
DESCRIPTION = "Eternal Terminal (ET) is a remote shell that automatically reconnects without \
interrupting the session."
LICENSE = "Apache-2.0"

PV = "6.2.8"

RPM_NAME = "EternalTerminal-6.2.8-1.1.aarch64.rpm"
RPM_HASH = "6e5a4e89f0b8418482f998b71d47c49ff9c1e6d0517955f68bc6d90a9920b8fab87776040451f0c2bbd08517fb01690487d04f5fbc48c337856dac66d822606f"

RPROVIDES:${PN} += "EternalTerminal \
config-EternalTerminal"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.1.1 \
libcurl.so.4 \
libgcc-s.so.1 \
libprotobuf.so.23.4.0 \
libsodium.so.23 \
libssl.so.1.1 \
libstdc++.so.6 \
libutempter.so.0 \
libz.so.1 \
systemd"

inherit rpm
