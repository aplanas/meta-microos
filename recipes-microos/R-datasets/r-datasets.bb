SUMMARY = "Package providing R-core datasets in R-datasets"
DESCRIPTION = "This package provides R-datasets, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-datasets-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "231d740cf056b991cc82b94c04fc685e2b630820236a4e4c11dc310cb571aaae0614aea02b10d5c7853db04c50450aa1c4af567cf14921c1b5df9a01b72b5813"

RPROVIDES:${PN} += "R-datasets \
R-datasets(aarch-64)"
RDEPENDS:${PN} += "R-base"

inherit rpm
