SUMMARY = "Documentation for texlive-intcalc"
DESCRIPTION = "This package includes the documentation for texlive-intcalc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53168"

RPM_NAME = "texlive-intcalc-doc-2023.201.1.3svn53168-52.1.noarch.rpm"
RPM_HASH = "b0be0bef4ef4e056623ed2cd38c08c76577ca1fd2316d6ad9a808ef81491d93d0d91d82bc6a8f2d35f344ce86cbc60d83edf2d2fc36f59d7e5337a8c121dca2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-intcalc-doc"
RDEPENDS:${PN} += ""

inherit rpm
