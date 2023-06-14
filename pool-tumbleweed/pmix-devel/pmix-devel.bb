SUMMARY = "Process Management Interface for MPI"
DESCRIPTION = "This Package contains necessary files for development and building PMI-X \
aware applications."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-devel-3.2.3-10.1.aarch64.rpm"
RPM_HASH = "78576b46f0f7ede42408e955b38ee3f61aea3f2fb6e9d5e431659d0f3999267bfdea6175856377400b98b5a8bd96cfcf5adb08442167e28649987e85ddc60c7f"

RPROVIDES:${PN} += "pkgconfig-pmix \
pmix-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmca-common-dstore1 \
libpmix2 \
pkgconfig-hwloc \
pkgconfig-libevent \
pkgconfig-zlib \
pmix-headers"

inherit rpm
