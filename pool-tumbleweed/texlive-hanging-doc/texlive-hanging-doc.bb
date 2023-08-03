SUMMARY = "Documentation for texlive-hanging"
DESCRIPTION = "This package includes the documentation for texlive-hanging"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn15878"

RPM_NAME = "texlive-hanging-doc-2023.209.1.2bsvn15878-54.1.noarch.rpm"
RPM_HASH = "ea8345b555df61bd07d2b13460f641acfd2304a871574d722c2afb3cd8fbd28ce4cbaab616e4128d7f4aff0e0c8930cda9fac85365e21f6a9cbcaa5f6872b9a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hanging-doc"

RDEPENDS:${PN} += ""

inherit rpm
