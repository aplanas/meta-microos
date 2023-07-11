SUMMARY = "Development Files for FreeImage"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using FreeImage."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.18.0"

RPM_NAME = "freeimage-devel-3.18.0-6.4.aarch64.rpm"
RPM_HASH = "333e0a28678e47794e78d728f11187579c5bbfd98f4ab5fe0e2891a423f7d61d789c551cbf28493ef4f7e5613ccbae3ed3b13304da3fc16c7df877420c4f4e60"

RPROVIDES:${PN} += "freeimage-devel \
libfreeimage-devel"

RDEPENDS:${PN} += "libfreeimage3 \
libfreeimageplus3"

inherit rpm
