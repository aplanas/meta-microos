SUMMARY = "Development files for dealii"
DESCRIPTION = "The dealii-devel package contains libraries and header files for \
developing applications that use dealii."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "deal_II-devel-9.4.2-1.4.aarch64.rpm"
RPM_HASH = "b980a73b6cbef2ba5b3fdc31564b16628caa7b182844f044534dd1e2f412ba5deb5ad762c62f92a19d63abda26372c406d3042910c149e07f993b20bf42a7f3a"

RPROVIDES:${PN} += "cmake(deal.II) \
cmake(deal.IIFeature) \
deal_II-devel \
deal_II-devel(aarch-64) \
dealii-devel \
pkgconfig(deal.II_release)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdeal_II9_4_2"

inherit rpm
