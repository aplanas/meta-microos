SUMMARY = "Static version of SuiteSparse libraries"
DESCRIPTION = "The suitesparse-static package contains the statically linkable \
version of the suitesparse libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "suitesparse-devel-static-5.13.0-49.2.aarch64.rpm"
RPM_HASH = "52abe54e78934f122990b3c5fafe9d22412b881e674fca974335a7c2a004793cf0fc37ae82f5f8d942a94209b2e4d4fe934c7264d79ab2628bd72f157134088d"

RPROVIDES:${PN} += "suitesparse-devel-static"

RDEPENDS:${PN} += "suitesparse-devel"

inherit rpm
