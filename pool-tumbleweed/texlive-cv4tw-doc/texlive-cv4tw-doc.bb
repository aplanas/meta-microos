SUMMARY = "Documentation for texlive-cv4tw"
DESCRIPTION = "This package includes the documentation for texlive-cv4tw"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.2svn34577"

RPM_NAME = "texlive-cv4tw-doc-2023.204.0.0.2svn34577-54.1.noarch.rpm"
RPM_HASH = "19b9a2bf88e12a0d245794d1df27d3865410d6a2ff70ce772259b2155010660f6793687563ebfbf77fd393f7050c0d86f83ffac7c56edf6989732b3a40a5caa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cv4tw-doc"

RDEPENDS:${PN} += ""

inherit rpm
