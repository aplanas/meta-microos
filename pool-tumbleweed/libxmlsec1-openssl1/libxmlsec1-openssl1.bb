SUMMARY = "OpenSSL crypto plugin for XML Security Library"
DESCRIPTION = "OpenSSL plugin for XML Security Library provides OpenSSL based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-openssl1-1.2.37-3.1.aarch64.rpm"
RPM_HASH = "526d79d36446b2f46c1ccaa7b5a4ca023968adec18aa46f2dc26df3a3895cc024f625a969d79cb2d4ca7dce693d2cecc1fa2fbcc1d9124bc86e2dd928573bdd3"

RPROVIDES:${PN} += "libxmlsec1-openssl.so.1 \
libxmlsec1-openssl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcrypto.so.3 \
libxml2.so.2 \
libxmlsec1-1 \
libxmlsec1.so.1"

inherit rpm
