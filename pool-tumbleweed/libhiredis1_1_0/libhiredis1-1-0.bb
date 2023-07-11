SUMMARY = "Shared library for hiredis"
DESCRIPTION = "Shared library for hiredis. The hiredis-example and \
hiredis-test are in hiredis package."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "libhiredis1_1_0-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "1d0d7c48c59b73de22d92a7ff6910c85c6aaa5f372787fde5fc1782e39a2c1600b2d5ae0441990ebfd48cd752debf33cbf06ecc9d5adf5632234dc939ca46c47"

RPROVIDES:${PN} += "libhiredis-ssl.so.1.1.0 \
libhiredis.so.1.1.0 \
libhiredis1-1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
