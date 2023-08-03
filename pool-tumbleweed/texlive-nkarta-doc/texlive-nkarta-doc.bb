SUMMARY = "Documentation for texlive-nkarta"
DESCRIPTION = "This package includes the documentation for texlive-nkarta"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2svn16437"

RPM_NAME = "texlive-nkarta-doc-2023.209.0.0.2svn16437-55.1.noarch.rpm"
RPM_HASH = "559d74b83a880b978132785b4501277ca6de822542838bda7ab516fe323900e0ca6729dad9eff60d23ec7c0a995ea0021919d9f1620efc8f210451f518c94132"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nkarta-doc"

RDEPENDS:${PN} += ""

inherit rpm
