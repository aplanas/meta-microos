SUMMARY = "ISO C11 implementation of the Key Management Interoperability Protocol"
DESCRIPTION = "libkmip is an ISO C11 implementation of the Key Management \
Interoperability Protocol (KMIP), an OASIS communication standard \
for the management of objects stored and maintained by key \
management systems. KMIP defines how key management operations \
and operation data should be encoded and communicated, between \
client and server applications. Supported operations include \
creating, retrieving, and destroying keys. Supported object types \
include symmetric and asymmetric encryption keys. \
 \
For more information on KMIP, check out the OASIS KMIP Technical \
Committee and the OASIS KMIP Documentation. \
 \
This package contains the shared library."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "libkmip0-0.2.0-1.8.aarch64.rpm"
RPM_HASH = "d16949763598aa2e36f2e71ff425e2418712324ab99e6d32ca724e9191dbc34cf53ece84d8b6d4649698ba7182472dbeb55d1504144c2a57350ddc8c62c1678e"

RPROVIDES:${PN} += "libkmip.so.0 \
libkmip0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
