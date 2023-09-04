SUMMARY = "Documentation for texlive-huaz"
DESCRIPTION = "This package includes the documentation for texlive-huaz"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64723"

RPM_NAME = "texlive-huaz-doc-2023.209.1.0svn64723-54.1.noarch.rpm"
RPM_HASH = "da6da5573903e5e0cafea2be02df25de74c19cc7e244110043898876f9b456e1f7b1a5cf7d7d2dd79c858906bc4a5f7b3b13c1ac718d06adbf1a221e7b7d2968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-huaz-doc-hu \
texlive-huaz-doc"

RDEPENDS:${PN} += ""

inherit rpm
