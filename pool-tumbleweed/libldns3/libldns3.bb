SUMMARY = "A library for developing the Domain Name System"
DESCRIPTION = "ldns is a C library that can be used for domain name system (DNS) \
development. It supports RFCs like the DNSSEC documents, and allows \
developers to create software conforming to RFCs, as well as \
experimental software for current Internet Drafts."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "libldns3-1.8.3-1.7.aarch64.rpm"
RPM_HASH = "b1d650bb094b23e3beec2553ce5b8f87422282b1230a02f819018cb29bab8bc7deedd9fc51e7e879ec729c591ca4432b887020a626d98e386076f18bac1af147"

RPROVIDES:${PN} += "libldns.so.3 \
libldns3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
