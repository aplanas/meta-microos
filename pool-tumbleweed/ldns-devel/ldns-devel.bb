SUMMARY = "Development files for ldns"
DESCRIPTION = "ldns is a C library that can be used for domain name system (DNS) \
development. It supports RFCs like the DNSSEC documents, and allows \
developers to create software conforming to RFCs, as well as \
experimental software for current Internet Drafts. \
 \
This package holds the development files."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "ldns-devel-1.8.3-1.4.aarch64.rpm"
RPM_HASH = "59793833beb1dddfa89784a99574fb2da519ed0e38734b48d10b0779f45b015c0fe43b7908e5834569a6e038f422713ff9c326e44f802d47b84b75aac644d9d6"

RPROVIDES:${PN} += "ldns-devel \
pkgconfig-ldns"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libldns3 \
openssl-devel"

inherit rpm
