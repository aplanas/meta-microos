SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7552"

RPM_NAME = "libm2iso18-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "24fc7e8aa788dfa19d2d6c0e0b1d4ce2e46b6ad2c20c965f82ac18015f10dc72d1ff87513cca39677b5a5958f0ba2a29ba037652ea30df84c108a2b3ad4b2a37"

RPROVIDES:${PN} += "libm2iso.so.18 \
libm2iso18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
