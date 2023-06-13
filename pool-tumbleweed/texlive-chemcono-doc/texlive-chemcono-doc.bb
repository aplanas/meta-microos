SUMMARY = "Documentation for texlive-chemcono"
DESCRIPTION = "This package includes the documentation for texlive-chemcono"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn17119"

RPM_NAME = "texlive-chemcono-doc-2023.201.1.3svn17119-53.1.noarch.rpm"
RPM_HASH = "8953493980bad768d178c13d6e8f7e63003c22a29766beeb818f78bf72aa024f7d0e8417cbd753c05dec42b02f028a167ff32f446accd6e0cf1f35ae7b72857a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemcono-doc"

RDEPENDS:${PN} += ""

inherit rpm
