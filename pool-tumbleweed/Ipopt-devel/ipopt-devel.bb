SUMMARY = "Development and header files for Ipopt"
DESCRIPTION = "This package contains the development and header files for Ipopt."
LICENSE = "EPL-2.0"

PV = "3.14.12"

RPM_NAME = "Ipopt-devel-3.14.12-1.2.aarch64.rpm"
RPM_HASH = "e336a680464a68c394abf79de0a7147f14367a2e63e93dd10ce642104fac43e8de86fa8f5d49da3c7bcfc1e2d938a4b56cb286e9740f54da7e46478948b20ddc"

RPROVIDES:${PN} += "Ipopt-devel \
ipopt-devel \
pkgconfig-ipopt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libipopt3 \
mumps-devel"

inherit rpm
