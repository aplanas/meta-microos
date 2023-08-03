SUMMARY = "Documentation for texlive-tonevalue"
DESCRIPTION = "This package includes the documentation for texlive-tonevalue"
LICENSE = "Apache-1.0"

PV = "2023.209.1.0svn60058"

RPM_NAME = "texlive-tonevalue-doc-2023.209.1.0svn60058-53.1.noarch.rpm"
RPM_HASH = "76c4dec734e910a5a8e7b3aef095f13f5e2ed78f811013199f097593c20335cd94ca65de934c3f648a49da5829a831cbc012ddd02f6a39d0c29c938fac23db35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tonevalue-doc"

RDEPENDS:${PN} += ""

inherit rpm
