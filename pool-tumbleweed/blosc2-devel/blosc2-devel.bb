SUMMARY = "Development libraries for libblosc2-2"
DESCRIPTION = "This package provides development libraries and headers \
for libblosc2-2."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "2.9.1"

RPM_NAME = "blosc2-devel-2.9.1-2.1.aarch64.rpm"
RPM_HASH = "d6b2363ad2e93dbfef7712e8f6b856a80a230f871fce1b2ba252234b25184b45233d46530dd70a16f710ef4883b8d6fea68735108d59c7043dd23ec3bdc20193"

RPROVIDES:${PN} += "blosc2-devel \
blosc2-devel(aarch-64) \
pkgconfig(blosc2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblosc2-2"

inherit rpm
