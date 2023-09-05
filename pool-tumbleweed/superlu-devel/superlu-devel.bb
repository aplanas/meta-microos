SUMMARY = "Headers and development library for libsuperlu6"
DESCRIPTION = "SuperLU headers and libraries files needed for development %{with_hpc:(HPC variant)}"
LICENSE = "BSD-3-Clause"

PV = "6.0.1"

RPM_NAME = "superlu-devel-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "2750eb2eb77cc3257229098f5bf4a2982636af12c2da46b8b8792b2c9e599ac6dda5eccd4ffcfd31861c8eb1f1d9831f11675fbb610932bd051538a5289a9079"

RPROVIDES:${PN} += "cmake-superlu \
pkgconfig-superlu \
superlu-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsuperlu6"

inherit rpm
