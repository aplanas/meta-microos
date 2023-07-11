SUMMARY = "A library for developing the Domain Name System"
DESCRIPTION = "ldns is a C library that can be used for domain name system (DNS) \
development. It supports RFCs like the DNSSEC documents, and allows \
developers to create software conforming to RFCs, as well as \
experimental software for current Internet Drafts. \
 \
This package holds the tools/examples from ldns."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "ldns-1.8.3-1.7.aarch64.rpm"
RPM_HASH = "dfb5c4333c0fd132e068b4d1fa2d66a068bf9e7119b85563dd577fcfdee63a9f71128a9f53bf52044e6a9e99ba343fbf82ab816aa549fa1e9c54ac332f9ae459"

RPROVIDES:${PN} += "ldns"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libldns.so.3 \
libpcap.so.1 \
libssl.so.3"

inherit rpm
