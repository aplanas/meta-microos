SUMMARY = "OpenSSL crypto plugin for XML Security Library"
DESCRIPTION = "OpenSSL plugin for XML Security Library provides OpenSSL based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-openssl1-1.2.37-2.3.aarch64.rpm"
RPM_HASH = "4579927ac13bf1c549cf73dd5d66f2293a2b5734e5818a1be5090741f5a4c76b307307aa71e185b259e35e97e53d567deb894376f3a47957bf7c8cd377049f21"

RPROVIDES:${PN} += "libxmlsec1-openssl.so.1 \
libxmlsec1-openssl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcrypto.so.3 \
libxml2.so.2 \
libxmlsec1-1 \
libxmlsec1.so.1"

inherit rpm
