SUMMARY = "Package providing R-core datasets in R-datasets"
DESCRIPTION = "This package provides R-datasets, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-datasets-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "eaece273bae1251b0c0439cbce2a5a3775e4ed4ab4554c2029a7de1ccc9337405daa679cf4ce0d86c0d320dce6e39143173afea87e724bd029ea63960df4eb8b"

RPROVIDES:${PN} += "R-datasets"

RDEPENDS:${PN} += "R-base"

inherit rpm
