SUMMARY = "Development files for bcmatroska2"
DESCRIPTION = "This package includes the files necessary for compiling and linking \
applications which will use libbcmatroska2."
LICENSE = "BSD-3-Clause & Zlib & GPL-2.0-or-later"

PV = "5.2.1"

RPM_NAME = "bcmatroska2-devel-5.2.1-1.4.aarch64.rpm"
RPM_HASH = "ddc06f7989784689d56d8925231be4883e37e85ab9e2d4ff2066b2f1848a0008600d8b4d2893ce3e8431e6aafc0727aa921aeb2d3ea95eb7064b0d9081b05ac4"

RPROVIDES:${PN} += "bcmatroska2-devel"

RDEPENDS:${PN} += "libbcmatroska2-0"

inherit rpm
