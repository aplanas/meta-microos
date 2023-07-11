SUMMARY = "Udunits2 compatibility layer for udunits v1 API"
DESCRIPTION = "This package contains the files needed for compiling programs using \
the udunits2 compatibility library."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "udunits-compat-devel-2.2.28-1.9.aarch64.rpm"
RPM_HASH = "4926565b1f123c969c2bae03877d433d50fd89153f28c558258ca9019cdcf56511bfea922f42a422edd05147c414eca70b42c08f1e332370c7be167b7946722b"

RPROVIDES:${PN} += "udunits-compat-devel \
udunits-devel"

RDEPENDS:${PN} += "udunits-compat \
udunits2-devel"

inherit rpm
