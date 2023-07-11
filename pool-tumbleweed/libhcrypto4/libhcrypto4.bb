SUMMARY = "Cryptographic library from Heimdal Kerberos"
DESCRIPTION = "This package contains the cryptographic library required for Heimdal."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libhcrypto4-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "39914b27d9b85bb431eb7346e5126fdb468959e56e508fd5037d797dc60b0290a35ee62194d60037400025849a1f759129a6f241c9f19d819cb8561b94355825"

RPROVIDES:${PN} += "libhcrypto.so.4 \
libhcrypto4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1.so.8 \
libc.so.6 \
libheimbase.so.1 \
libroken.so.18"

inherit rpm
