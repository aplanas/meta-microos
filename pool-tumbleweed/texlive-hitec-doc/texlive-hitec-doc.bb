SUMMARY = "Documentation for texlive-hitec"
DESCRIPTION = "This package includes the documentation for texlive-hitec"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0betasvn15878"

RPM_NAME = "texlive-hitec-doc-2023.209.0.0.0betasvn15878-54.2.noarch.rpm"
RPM_HASH = "18461b5546dc77e456e3850cfd083fca7e7be28e823ce2185f168d80c43f866a0eb2bff076b34d679306575e6cd17ae2f1814673c61a7ae56094ba3f332739d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hitec-doc"

RDEPENDS:${PN} += ""

inherit rpm
