SUMMARY = "Data files required for analyses using lalsimulation"
DESCRIPTION = "This package provides the data files used when running analyses involving \
lalsimulation."
LICENSE = "GPL-2.0-only"

PV = "4.0.0"

RPM_NAME = "lalsimulation-data-4.0.0-2.1.noarch.rpm"
RPM_HASH = "e1427bfc5f5ca9be802aaab1b8157949b9a3e763b88bd800bf30abb041a4236c613c14f7f3a73c3dcb5e9d883cadfd96c6f8d1ebf80249f6a8f9261e2a894b79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lalsimulation-data"

RDEPENDS:${PN} += ""

inherit rpm
