SUMMARY = "Documentation for texlive-bullcntr"
DESCRIPTION = "This package includes the documentation for texlive-bullcntr"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.04svn15878"

RPM_NAME = "texlive-bullcntr-doc-2023.201.0.0.04svn15878-52.1.noarch.rpm"
RPM_HASH = "4f84064b3aa7874ab1b69d7be5dd74623f792feb0f475870dc07e506439b93fd5029838371b59cee483bf0a3332585e2c99efbb78ba119bc5df85855d2cf1ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bullcntr-doc"

RDEPENDS:${PN} += ""

inherit rpm
