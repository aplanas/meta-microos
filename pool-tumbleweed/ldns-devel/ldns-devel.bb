SUMMARY = "Development files for ldns"
DESCRIPTION = "ldns is a C library that can be used for domain name system (DNS) \
development. It supports RFCs like the DNSSEC documents, and allows \
developers to create software conforming to RFCs, as well as \
experimental software for current Internet Drafts. \
 \
This package holds the development files."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "ldns-devel-1.8.3-1.8.aarch64.rpm"
RPM_HASH = "347ef0cbde39b386047f60d66bbf67cdc479759cdd78b98ce3cd395e7979af1690c0187b66255a59fad0378c4097444a650d711035f45d58f7e91629413d9568"

RPROVIDES:${PN} += "ldns-devel \
pkgconfig-ldns"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libldns3 \
openssl-devel"

inherit rpm
