SUMMARY = "Documentation for texlive-colortab"
DESCRIPTION = "This package includes the documentation for texlive-colortab"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn22155"

RPM_NAME = "texlive-colortab-doc-2023.201.1.0svn22155-53.1.noarch.rpm"
RPM_HASH = "6e513a13dbbb7a89ea1c465736ecb462a9159575981828f29a6f2e959ea2195a222ba2b5a34ada7d8b959e5f6aae7506e1fd6b9fcc32cac75ca0659956c54472"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colortab-doc"
RDEPENDS:${PN} += ""

inherit rpm
