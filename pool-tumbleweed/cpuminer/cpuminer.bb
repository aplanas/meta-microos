SUMMARY = "A multi-threaded CPU Bitcoin and Litecoin miner"
DESCRIPTION = "An assembly optimized CPU miner for the Bitcoin and Litecoin cryptocurrencies, based on Jeff Garzik's reference cpuminer."
LICENSE = "GPL-2.0-only"

PV = "2.5.1"

RPM_NAME = "cpuminer-2.5.1-1.10.aarch64.rpm"
RPM_HASH = "9ad7d932487b39caab03426940c4f4d3550038558c1026ed3f1930016665370cba7ce77563df378dab85b37a5651c6d0353f4b45eaf2ac159941b261fa67f3a3"

RPROVIDES:${PN} += "cpuminer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libjansson.so.4"

inherit rpm
