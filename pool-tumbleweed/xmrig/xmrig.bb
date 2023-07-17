SUMMARY = "XMR mining application"
DESCRIPTION = "Open source CPU/GPU XMR cryptocurrency miner."
LICENSE = "GPL-3.0-only"

PV = "6.20.0"

RPM_NAME = "xmrig-6.20.0-1.1.aarch64.rpm"
RPM_HASH = "b83521a15af263a2f237b3721c339e3fd800c8f22fd4659849439b090d77093318c2a06f8fede159b0e2247760e7c30c479d03a1a4ebce42fd73c1f1cc9863e1"

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
