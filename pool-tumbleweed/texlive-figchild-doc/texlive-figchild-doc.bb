SUMMARY = "Documentation for texlive-figchild"
DESCRIPTION = "This package includes the documentation for texlive-figchild"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.1svn62945"

RPM_NAME = "texlive-figchild-doc-2023.209.2.1.1svn62945-53.1.noarch.rpm"
RPM_HASH = "fbe67e6eebf03deb98bc5ef846088ffce8bd8c3aa2952c4bdc2f46ce94bebe396f23a9c5bfe77979d1b492533170969b9eaad79d21a038100d7b0baa508813c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figchild-doc"

RDEPENDS:${PN} += ""

inherit rpm
