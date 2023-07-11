SUMMARY = "Minimalistic C client for Redis"
DESCRIPTION = "Hiredis is a minimalistic C client library for the \
Redis database."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "hiredis-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "e5510cd6d5214cde7d1d48ac39078ad245affb4548366c9b356a751e05b5b1ee95b9fd9047e27e8defcf09cbe079a22f359d8e858b888939441756311caf6543"

RPROVIDES:${PN} += "hiredis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
