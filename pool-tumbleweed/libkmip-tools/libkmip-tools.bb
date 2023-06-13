SUMMARY = "Tools for the Key Management Interoperability Protocol"
DESCRIPTION = "libkmip is an ISO C11 implementation of the Key Management \
Interoperability Protocol (KMIP), an OASIS communication standard \
for the management of objects stored and maintained by key \
management systems. KMIP defines how key management operations \
and operation data should be encoded and communicated, between \
client and server applications. Supported operations include \
creating, retrieving, and destroying keys. Supported object types \
include symmetric and asymmetric encryption keys. \
 \
This package contains various tools."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "libkmip-tools-0.2.0-1.8.aarch64.rpm"
RPM_HASH = "069fea8ba196799ae9f3dc1d4305cb56aa4793a6df4d5efb8d3d8f2b755ae35d83fadc7049c85f62ef956b31e78c64235d7b2b74a922ee355e02dbbd3060295b"

RPROVIDES:${PN} += "libkmip-tools \
libkmip-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libssl.so.3()(64bit)"

inherit rpm
