SUMMARY = "Development files for ldns"
DESCRIPTION = "ldns is a C library that can be used for domain name system (DNS) \
development. It supports RFCs like the DNSSEC documents, and allows \
developers to create software conforming to RFCs, as well as \
experimental software for current Internet Drafts. \
 \
This package holds the development files."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "ldns-devel-1.8.3-1.7.aarch64.rpm"
RPM_HASH = "df13bb0688275dc5ca44302c34268bd69d22953f5613db3033c61aebb9734c0f777f0be0edd52a28fbcf5122ea3ee7b85ec2438b4b1a8c043c755dccbfcfd9f0"

RPROVIDES:${PN} += "ldns-devel \
pkgconfig-ldns"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libldns3 \
openssl-devel"

inherit rpm
