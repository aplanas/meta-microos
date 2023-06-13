SUMMARY = "Documentation for texlive-hycolor"
DESCRIPTION = "This package includes the documentation for texlive-hycolor"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn53584"

RPM_NAME = "texlive-hycolor-doc-2023.201.1.10svn53584-52.1.noarch.rpm"
RPM_HASH = "54858150dddb51bd8b137e6575b0710232ea772c3e6df7b4ba6a260c0b0d508a6bb989352321db45da5807e3c18baa3eba36fafdb5f7c1d31cbccf854c89232f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-hycolor-doc:en) \
texlive-hycolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
