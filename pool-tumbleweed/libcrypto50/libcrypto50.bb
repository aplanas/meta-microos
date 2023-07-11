SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "The 'crypto' library implements a wide range of cryptographic \
algorithms used in various Internet standards. The services provided \
by this library are used by the LibreSSL implementations of SSL, TLS \
and S/MIME, and they have also been used to implement SSH, OpenPGP, \
and other cryptographic standards."
LICENSE = "OpenSSL"

PV = "3.7.0"

RPM_NAME = "libcrypto50-3.7.0-1.3.aarch64.rpm"
RPM_HASH = "7a4c8ffba74681f8477171743d515893ef7275f649b33de5a160d8ed13122a3e21e649385a1352e5407bc07f59094dc0ee48d60d3c42ea41165a71c239fa735e"

RPROVIDES:${PN} += "libcrypto.so.50 \
libcrypto50"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
