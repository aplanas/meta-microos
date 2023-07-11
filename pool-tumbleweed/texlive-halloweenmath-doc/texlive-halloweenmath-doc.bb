SUMMARY = "Documentation for texlive-halloweenmath"
DESCRIPTION = "This package includes the documentation for texlive-halloweenmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn52602"

RPM_NAME = "texlive-halloweenmath-doc-2023.201.0.0.11svn52602-53.2.noarch.rpm"
RPM_HASH = "ce86e5060b91e9411cf20e527a17ce79fb4867bd30cea22b797fa2f17866225042dbbe191e3a77de1687bf2bf2a79af13f472e161805530afe64d44a4d69a264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-halloweenmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
