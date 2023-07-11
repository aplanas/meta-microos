SUMMARY = "Documentation for texlive-inter"
DESCRIPTION = "This package includes the documentation for texlive-inter"
LICENSE = "OFL-1.1"

PV = "2023.208.svn58892"

RPM_NAME = "texlive-inter-doc-2023.208.svn58892-53.1.noarch.rpm"
RPM_HASH = "624449531e8987aec172766440fa8c96091ea9508fb3dc0c528c2062178203c4d820a7b48d1330814f73baf89b9fea152408734c6136168341a942d4758bdae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inter-doc"

RDEPENDS:${PN} += ""

inherit rpm
