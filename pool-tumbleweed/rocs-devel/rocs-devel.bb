SUMMARY = "Development files for Rocs"
DESCRIPTION = "This package provides development files and headers needed \
to build software using Rocs."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "rocs-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "b9e79b5549bf5cf563c40427b7a8a5485d2f51b80bd45df868c7f3b091508aca7da5cd5b9c8a7e4bedd0c2f82013599ef40992a9f4e0f8048bfba8fac36b4630"

RPROVIDES:${PN} += "rocs-devel"

RDEPENDS:${PN} += "librocsgraphtheory0"

inherit rpm
