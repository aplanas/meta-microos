SUMMARY = "XMR mining application"
DESCRIPTION = "Open source CPU/GPU XMR cryptocurrency miner."
LICENSE = "GPL-3.0-only"

PV = "6.19.2"

RPM_NAME = "xmrig-6.19.2-1.1.aarch64.rpm"
RPM_HASH = "4f0f1f6e93ba75acc3472d03e6085e5f1e4f5b42e00b50c39530840f2ece64a8ac40c530ba7524b6e17562f966eaf6c600bf7dd47783e3aea58b7261c8fb36f1"

RPROVIDES:${PN} += "config-xmrig \
xmrig"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libhwloc.so.15 \
libm.so.6 \
libssl.so.3 \
libuv.so.1"

inherit rpm
