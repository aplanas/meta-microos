SUMMARY = "Documentation for texlive-gloss"
DESCRIPTION = "This package includes the documentation for texlive-gloss"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.2svn15878"

RPM_NAME = "texlive-gloss-doc-2023.209.1.5.2svn15878-54.1.noarch.rpm"
RPM_HASH = "686f06aa53fc253922260ce1ce346a78206d1c61a148cd43cb7901345967442f694b0b8b62c175e521df0c4524702c02198acea7a4c7021f6b7e15ab6a4defb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-doc"

RDEPENDS:${PN} += ""

inherit rpm
