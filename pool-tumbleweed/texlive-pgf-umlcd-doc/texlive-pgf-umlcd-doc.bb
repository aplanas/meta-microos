SUMMARY = "Documentation for texlive-pgf-umlcd"
DESCRIPTION = "This package includes the documentation for texlive-pgf-umlcd"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.3svn63386"

RPM_NAME = "texlive-pgf-umlcd-doc-2023.209.0.0.3svn63386-52.1.noarch.rpm"
RPM_HASH = "ee86c6c1de2dc7605f4aef7264ddd1d8b87b1112caa7553c28a6ddb137a143e9cf1b2fd7af8fbe0312d75887e3fc6a1252c87a2e9a3c38af00547f1abc285b49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-umlcd-doc"

RDEPENDS:${PN} += ""

inherit rpm
