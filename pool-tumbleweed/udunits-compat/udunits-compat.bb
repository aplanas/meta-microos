SUMMARY = "Udunits2 compatibility layer for udunits v1 API"
DESCRIPTION = "A compatibility layer allowing applications written for libudunits to \
work with libudunits2."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "udunits-compat-2.2.28-1.9.aarch64.rpm"
RPM_HASH = "f55204c35a83ac46b5e5283e86e814b773757d0d5f86b9729e390e7af1fea9da7341ad4923a4e4141e57a70967c8188f128205cc50201f68d2dc3b324869375e"

RPROVIDES:${PN} += "udunits \
udunits-compat"

RDEPENDS:${PN} += "/sbin/ldconfig \
udunits2"

inherit rpm
