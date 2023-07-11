SUMMARY = "XMR mining application"
DESCRIPTION = "Open source CPU/GPU XMR cryptocurrency miner."
LICENSE = "GPL-3.0-only"

PV = "6.19.3"

RPM_NAME = "xmrig-6.19.3-1.1.aarch64.rpm"
RPM_HASH = "c8bed33602698e65eae565f95895a7fc3c9f60470d8b1a471786c6c5010c60b61d0b1e9f860254d4f0d50b2e6c38fefacd28abaf873d4aa2b653cbb698a2488f"

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
