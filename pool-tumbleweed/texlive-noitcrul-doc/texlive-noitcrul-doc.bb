SUMMARY = "Documentation for texlive-noitcrul"
DESCRIPTION = "This package includes the documentation for texlive-noitcrul"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-noitcrul-doc-2023.209.0.0.2svn15878-55.1.noarch.rpm"
RPM_HASH = "141d5db978b86dcea5ecdd3acb35f4c1107aeca940962f0983bfcac258681f2786a3e48d93f6c7bc0f3eb1d5775ec911d63c5b76ada7cabd114b2085147ca726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-noitcrul-doc-de \
texlive-noitcrul-doc"

RDEPENDS:${PN} += ""

inherit rpm
