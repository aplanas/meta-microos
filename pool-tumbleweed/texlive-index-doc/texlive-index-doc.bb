SUMMARY = "Documentation for texlive-index"
DESCRIPTION = "This package includes the documentation for texlive-index"
LICENSE = "LPPL-1.0"

PV = "2023.208.4.1betasvn24099"

RPM_NAME = "texlive-index-doc-2023.208.4.1betasvn24099-53.1.noarch.rpm"
RPM_HASH = "e85451ff6e22d598819bc903dbc6479a6ae9fa2bdc3e91e277e111f3e903acede56ab1d9c07013d28d043d5407cddb37fef78e660e066a298d2c68fd64daf2fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-index-doc"

RDEPENDS:${PN} += ""

inherit rpm
