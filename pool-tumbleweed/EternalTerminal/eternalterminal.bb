SUMMARY = "Remote shell that survives IP roaming and disconnect"
DESCRIPTION = "Eternal Terminal (ET) is a remote shell that automatically reconnects without \
interrupting the session."
LICENSE = "Apache-2.0"

PV = "6.2.4"

RPM_NAME = "EternalTerminal-6.2.4-3.1.aarch64.rpm"
RPM_HASH = "77d7e36668c3e86ce7471e60b1821598245bcadeef24e42c1c8415d25a74d7d9d4c3a41fe09f03307a5ad62013e278d495d7015d56ad53ab0b3a92e14a709d38"

RPROVIDES:${PN} += "EternalTerminal \
EternalTerminal(aarch-64) \
config(EternalTerminal)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.1.1()(64bit) \
libcrypto.so.1.1(OPENSSL_1_1_0)(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libprotobuf-lite-3.21.12.so()(64bit) \
libsodium.so.23()(64bit) \
libssl.so.1.1()(64bit) \
libssl.so.1.1(OPENSSL_1_1_0)(64bit) \
libstdc++.so.6()(64bit) \
libutempter.so.0()(64bit) \
libz.so.1()(64bit) \
systemd"

inherit rpm
