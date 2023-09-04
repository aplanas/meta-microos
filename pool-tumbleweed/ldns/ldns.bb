SUMMARY = "A library for developing the Domain Name System"
DESCRIPTION = "ldns is a C library that can be used for domain name system (DNS) \
development. It supports RFCs like the DNSSEC documents, and allows \
developers to create software conforming to RFCs, as well as \
experimental software for current Internet Drafts. \
 \
This package holds the tools/examples from ldns."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "ldns-1.8.3-1.8.aarch64.rpm"
RPM_HASH = "051cb1a04d181704eecba84750edde889f47325b415d9140c8ca92698bf585067ebdd73cf84c04e286c0fd3a2cdb1be9d5af97617c329954c9c0c7f159cfa7ac"

RPROVIDES:${PN} += "ldns"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libldns.so.3 \
libpcap.so.1 \
libssl.so.3"

inherit rpm
