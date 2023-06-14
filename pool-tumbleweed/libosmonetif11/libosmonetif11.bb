SUMMARY = "Osmocom library for muxed audio"
DESCRIPTION = "Network interface demuxer library for OsmoCom projects."
LICENSE = "AGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmonetif11-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "4acbf8fdd4f89fa654e6e339ea32c2cdf1b8cdf786e6d49e33e3c799db15a85ddebe7be71c95364de2b4a347a7813220258c35db8815ac586837d363d9af2dac"

RPROVIDES:${PN} += "libosmonetif.so.11 \
libosmonetif11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libosmogsm.so.18 \
libsctp.so.1 \
libtalloc.so.2"

inherit rpm
