SUMMARY = "Development files for dealii-openmpi4"
DESCRIPTION = "The dealii-openmpi4-devel package contains libraries and header files for \
developing applications that use dealii-openmpi4."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.1"

RPM_NAME = "deal_II-openmpi4-devel-9.5.1-1.1.aarch64.rpm"
RPM_HASH = "7d76f69e99466ec1575b5ae2cdec51e345dfb7c296b348ea8e364f8e75379f5bd21c008be220452f03e759c5e2e8bc50ee6077b135d1f6bd7ac721206736c6df"

RPROVIDES:${PN} += "deal-II-openmpi4-devel \
dealii-openmpi4-openmpi4-devel"

RDEPENDS:${PN} += "libdeal-II9-5-1-openmpi4"

inherit rpm
