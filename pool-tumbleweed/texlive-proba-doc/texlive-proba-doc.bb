SUMMARY = "Documentation for texlive-proba"
DESCRIPTION = "This package includes the documentation for texlive-proba"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-proba-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "6c0e471ced67b67154f6e71c102da407b0e95a8076a80577c500fa14a1b1b017e843513126365aa472588c98007c28ab05a5dd357659c81e7cfd5a5edf5bc710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proba-doc"

RDEPENDS:${PN} += ""

inherit rpm
