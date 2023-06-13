SUMMARY = "A multi-threaded CPU Bitcoin and Litecoin miner"
DESCRIPTION = "An assembly optimized CPU miner for the Bitcoin and Litecoin cryptocurrencies, based on Jeff Garzik's reference cpuminer."
LICENSE = "GPL-2.0-only"

PV = "2.5.1"

RPM_NAME = "cpuminer-2.5.1-1.9.aarch64.rpm"
RPM_HASH = "64af2765306df18209225de2554485b2e681697bea720721b79bfb52219558dbc333bdf5da79a82dda588728208278d36044e90a3c5d5f9130345d1ebf029bff"

RPROVIDES:${PN} += "cpuminer \
cpuminer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libjansson.so.4()(64bit)"

inherit rpm
