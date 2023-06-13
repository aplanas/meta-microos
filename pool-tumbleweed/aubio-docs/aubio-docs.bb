SUMMARY = "Documentation for aubio library"
DESCRIPTION = "This package includes the documentation for aubio library."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "aubio-docs-0.4.9-9.1.noarch.rpm"
RPM_HASH = "9215a29893710d1de3b547aaeecfecad32231f557e706e2b0a7ecfce152f60d02404c81edcf72c7470bde7c664b75a3b7256e8e515668845f3fd1d91c445dfa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aubio-docs"

RDEPENDS:${PN} += ""

inherit rpm
