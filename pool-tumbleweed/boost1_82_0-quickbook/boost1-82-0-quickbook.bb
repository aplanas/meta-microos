SUMMARY = "Documentation tool geared towards C++"
DESCRIPTION = "QuickBook is a WikiWiki style documentation tool geared towards C++ \
documentation using simple rules and markup for simple formatting \
tasks."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost1_82_0-quickbook-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "eb9062a2cf6d6b58ae33f684519a42fa996f2263c5f95c944d3f9d68aca021c67020fa6159bcdfba1b391f747b7114fe99e4fd595a085ac2dfb49597bcf4d2aa"

RPROVIDES:${PN} += "boost1_82_0-quickbook \
boost1_82_0-quickbook(aarch-64) \
quickbook"

RDEPENDS:${PN} += "boost-license1_82_0 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
