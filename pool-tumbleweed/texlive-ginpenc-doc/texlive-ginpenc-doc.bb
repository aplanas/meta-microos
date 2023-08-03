SUMMARY = "Documentation for texlive-ginpenc"
DESCRIPTION = "This package includes the documentation for texlive-ginpenc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24980"

RPM_NAME = "texlive-ginpenc-doc-2023.209.1.0svn24980-53.1.noarch.rpm"
RPM_HASH = "92fa8f1f1d9aeb84d6ba035eff49096d38f74a382c58205f86026b75ed3b6a785424edc5d79c19df273caa2bbc9e6a0a7a2900eb57f46eafce7fd8266d16c68c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ginpenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
