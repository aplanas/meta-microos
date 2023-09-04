SUMMARY = "Documentation for texlive-inputnormalization"
DESCRIPTION = "This package includes the documentation for texlive-inputnormalization"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn59850"

RPM_NAME = "texlive-inputnormalization-doc-2023.209.0.0.2svn59850-54.1.noarch.rpm"
RPM_HASH = "cf98bb3557aa5652f0c2828739041463b1221a9be374ed75421add1ea6e5acc8236999c0cddab05ed090609f05915d1e08eb1362d2bebb04e28bd81b056c1743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inputnormalization-doc"

RDEPENDS:${PN} += ""

inherit rpm
