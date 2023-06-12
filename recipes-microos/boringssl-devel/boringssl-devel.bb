SUMMARY = "Development files for BoringSSL"
DESCRIPTION = "Development files for BoringSSL - an implementation of the Secure \
Sockets Layer (SSL) and Transport Layer Security (TLS) protocols, \
derived from OpenSSL."
LICENSE = "OpenSSL"

PV = "20200921"

RPM_NAME = "boringssl-devel-20200921-2.7.aarch64.rpm"
RPM_HASH = "09a10d3563b38ce2dc257c2a82d5b0bbd5ac4b70933191c142ceae17026378e6f7cb08811f3beb6d65af4affdfed6a1be10d047577d33c124a888fca1ce4f7d4"

RPROVIDES:${PN} += "boringssl-devel \
boringssl-devel(aarch-64)"
RDEPENDS:${PN} += "libboringssl1"

inherit rpm
