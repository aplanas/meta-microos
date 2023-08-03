SUMMARY = "Documentation for texlive-extract"
DESCRIPTION = "This package includes the documentation for texlive-extract"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9asvn52117"

RPM_NAME = "texlive-extract-doc-2023.209.1.9asvn52117-53.1.noarch.rpm"
RPM_HASH = "f77389d0b8e03542e11ab2ef4f248ace357420d962a033baaafccf2e265fc584ac894e4cacc770cdaac92a41d3ae2d1b22f86b58304826a025cafe9952548555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extract-doc"

RDEPENDS:${PN} += ""

inherit rpm
