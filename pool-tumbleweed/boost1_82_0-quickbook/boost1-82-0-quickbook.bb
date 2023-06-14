SUMMARY = "Documentation tool geared towards C++"
DESCRIPTION = "QuickBook is a WikiWiki style documentation tool geared towards C++ \
documentation using simple rules and markup for simple formatting \
tasks."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost1_82_0-quickbook-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "eb9062a2cf6d6b58ae33f684519a42fa996f2263c5f95c944d3f9d68aca021c67020fa6159bcdfba1b391f747b7114fe99e4fd595a085ac2dfb49597bcf4d2aa"

RPROVIDES:${PN} += "boost1-82-0-quickbook \
quickbook"

RDEPENDS:${PN} += "boost-license1-82-0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
