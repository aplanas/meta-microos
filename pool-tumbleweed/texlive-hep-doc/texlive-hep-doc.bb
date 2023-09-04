SUMMARY = "Documentation for texlive-hep"
DESCRIPTION = "This package includes the documentation for texlive-hep"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hep-doc-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "f53da82c373f1d5f099ab14e1c996a0d745bafbb95162ee7259f7348023c67f295013ff81cadf412b9f778eb290b500d00830aad8042d06c1866803e7c81d0a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-doc"

RDEPENDS:${PN} += ""

inherit rpm
