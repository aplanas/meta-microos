SUMMARY = "Package providing R-core datasets in R-datasets"
DESCRIPTION = "This package provides R-datasets, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-datasets-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "ccca0647aca69d86a45270e882c824046a51229a21473830be68d587ba5b01f8b36ef14cf6e9f907461014226ddaf90646eedc623e86838d7f2a142838aa3347"

RPROVIDES:${PN} += "R-datasets R-datasets(aarch-64)"
RDEPENDS:${PN} += "R-base"

inherit rpm
