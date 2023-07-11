SUMMARY = "Coturn utils"
DESCRIPTION = "This package contains the TURN client utils."
LICENSE = "BSD-3-Clause"

PV = "4.6.2"

RPM_NAME = "coturn-utils-4.6.2-1.3.aarch64.rpm"
RPM_HASH = "917e32204ef5f9f3e00cab5ebc8b256b7fce829247c5d7582553caa95505fadc965e41dabe07551c9ea693209d3e34f139131b7844d7045e5cbb0c729c5cecba"

RPROVIDES:${PN} += "coturn-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-core-2.1.so.7 \
libevent-extra-2.1.so.7 \
libssl.so.3"

inherit rpm
