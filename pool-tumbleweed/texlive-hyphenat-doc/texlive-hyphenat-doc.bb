SUMMARY = "Documentation for texlive-hyphenat"
DESCRIPTION = "This package includes the documentation for texlive-hyphenat"
LICENSE = "LPPL-1.0"

PV = "2023.208.2.3csvn15878"

RPM_NAME = "texlive-hyphenat-doc-2023.208.2.3csvn15878-53.1.noarch.rpm"
RPM_HASH = "0c9fbcf7707ceed124001ddc96f2e495ed17aff0da1fad0daeb272af4d45b83d527e2fad8747f49d3afdbd67c6dc8ca6a2d839bebc3d7ba67ad227505f36a3b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphenat-doc"

RDEPENDS:${PN} += ""

inherit rpm
