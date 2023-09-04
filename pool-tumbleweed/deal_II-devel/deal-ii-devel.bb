SUMMARY = "Development files for dealii"
DESCRIPTION = "The dealii-devel package contains libraries and header files for \
developing applications that use dealii."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.1"

RPM_NAME = "deal_II-devel-9.5.1-1.1.aarch64.rpm"
RPM_HASH = "d063d618510961251f76bbf1ea815de37e433a71ea48abaa7d74c72f305af32261fd11410bfbc2194227975a6ae6cbcf86f9b84acebf4d0f4eb94471e2bb7aa2"

RPROVIDES:${PN} += "cmake-deal.II \
deal-II-devel \
dealii-devel"

RDEPENDS:${PN} += "libdeal-II9-5-1"

inherit rpm
