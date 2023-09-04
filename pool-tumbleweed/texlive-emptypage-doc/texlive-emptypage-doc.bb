SUMMARY = "Documentation for texlive-emptypage"
DESCRIPTION = "This package includes the documentation for texlive-emptypage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn18064"

RPM_NAME = "texlive-emptypage-doc-2023.209.1.2svn18064-54.2.noarch.rpm"
RPM_HASH = "30dd17c9e353df4b4df8878f0d1a239397962c1a318a0ca0f07ba68a59594138778847bb68652f1360b9b0b678fca264788faa009a0f1959d38930f6068b7cd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emptypage-doc"

RDEPENDS:${PN} += ""

inherit rpm
