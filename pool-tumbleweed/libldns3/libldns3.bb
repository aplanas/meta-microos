SUMMARY = "A library for developing the Domain Name System"
DESCRIPTION = "ldns is a C library that can be used for domain name system (DNS) \
development. It supports RFCs like the DNSSEC documents, and allows \
developers to create software conforming to RFCs, as well as \
experimental software for current Internet Drafts."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "libldns3-1.8.3-1.8.aarch64.rpm"
RPM_HASH = "9902cd4dce71a30a804baa0396a71ec4be17c2d51c506a87755a3f5fe07454057514570d2e56284705bdcfada780a3d7e56049cfdcd64bfeb53c0925b47938c9"

RPROVIDES:${PN} += "libldns.so.3 \
libldns3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
