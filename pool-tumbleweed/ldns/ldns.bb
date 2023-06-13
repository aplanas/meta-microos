SUMMARY = "A library for developing the Domain Name System"
DESCRIPTION = "ldns is a C library that can be used for domain name system (DNS) \
development. It supports RFCs like the DNSSEC documents, and allows \
developers to create software conforming to RFCs, as well as \
experimental software for current Internet Drafts. \
 \
This package holds the tools/examples from ldns."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "ldns-1.8.3-1.4.aarch64.rpm"
RPM_HASH = "4a7e2140267c121ba5c5398826d346544a3a0737f354b04841a02851833fea2caea44cf8b53d0202857a1a9ac0ce8f82c7cb6d966acce793cf9632518cbb8918"

RPROVIDES:${PN} += "ldns \
ldns(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libldns.so.3()(64bit) \
libpcap.so.1()(64bit) \
libssl.so.3()(64bit)"

inherit rpm
