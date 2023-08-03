SUMMARY = "Documentation for texlive-bullcntr"
DESCRIPTION = "This package includes the documentation for texlive-bullcntr"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.04svn15878"

RPM_NAME = "texlive-bullcntr-doc-2023.209.0.0.04svn15878-53.1.noarch.rpm"
RPM_HASH = "e52840327d8b6e64af48f4cc7d7bf8bb1f6ad82aa9ea87eb06a7438855291a68b01dbceaaba73c383358c4acd6f1d6f0cd70340c39faf3cf357d31fc1b9ea671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bullcntr-doc"

RDEPENDS:${PN} += ""

inherit rpm
