SUMMARY = "Documentation for texlive-econometrics"
DESCRIPTION = "This package includes the documentation for texlive-econometrics"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39396"

RPM_NAME = "texlive-econometrics-doc-2023.201.1.0svn39396-53.2.noarch.rpm"
RPM_HASH = "8402fd525ec72989d41ddf1875458d5f2d8c4d7f7e6021955836522701260dd627a6952267d00ccfdd4504e3be08e521043a9bcfd52f090e1c93b03586c34493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econometrics-doc"

RDEPENDS:${PN} += ""

inherit rpm
