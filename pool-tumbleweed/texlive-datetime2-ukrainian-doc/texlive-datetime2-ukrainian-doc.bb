SUMMARY = "Documentation for texlive-datetime2-ukrainian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-ukrainian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn47552"

RPM_NAME = "texlive-datetime2-ukrainian-doc-2023.209.1.2asvn47552-53.1.noarch.rpm"
RPM_HASH = "0935800e063e49da03c1b831644571a3d6bb229eaa777620978a7639d77f05299dbbbbc1bca1f36c37277c8c1d31bfb06c0efa2eecd89c6eed5072912ba8f206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-ukrainian-doc"

RDEPENDS:${PN} += ""

inherit rpm
