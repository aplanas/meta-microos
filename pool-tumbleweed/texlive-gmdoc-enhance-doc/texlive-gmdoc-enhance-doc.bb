SUMMARY = "Documentation for texlive-gmdoc-enhance"
DESCRIPTION = "This package includes the documentation for texlive-gmdoc-enhance"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-gmdoc-enhance-doc-2023.209.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "1f8a7da1399799d57dec3ed33b65c61d9fd8363bb2f652e0523ab96d5c857600f5eaf2937aad682dc3ecb53cb790aace389a28e22079d17ab92231b4d493faab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmdoc-enhance-doc"

RDEPENDS:${PN} += ""

inherit rpm
