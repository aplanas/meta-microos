SUMMARY = "Documentation for texlive-combinedgraphics"
DESCRIPTION = "This package includes the documentation for texlive-combinedgraphics"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2.2svn27198"

RPM_NAME = "texlive-combinedgraphics-doc-2023.201.0.0.2.2svn27198-53.1.noarch.rpm"
RPM_HASH = "8a4929188282bc98d6933a6ed3bd555f2b55c5c3e64cac47f704c986dbbc237ae6680a47e3f48b78bf6faffe0fe8937f0c681f66df6458633c981c78632f9052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-combinedgraphics-doc"
RDEPENDS:${PN} += ""

inherit rpm
