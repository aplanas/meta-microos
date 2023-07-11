SUMMARY = "Documentation for texlive-quoting"
DESCRIPTION = "This package includes the documentation for texlive-quoting"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1csvn32818"

RPM_NAME = "texlive-quoting-doc-2023.201.0.0.1csvn32818-53.2.noarch.rpm"
RPM_HASH = "cf521ee38f434b45e2db28dbeaa841acf4c7cc8f78d28e7f22feb23cf690289c90d0cf13d71ff0c8804584fc9bab3f0de0fba26da850194d1d2dd526dc2d557f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quoting-doc"

RDEPENDS:${PN} += ""

inherit rpm
