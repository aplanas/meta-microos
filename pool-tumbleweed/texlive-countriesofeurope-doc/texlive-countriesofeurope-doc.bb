SUMMARY = "Documentation for texlive-countriesofeurope"
DESCRIPTION = "This package includes the documentation for texlive-countriesofeurope"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.23svn54512"

RPM_NAME = "texlive-countriesofeurope-doc-2023.209.0.0.23svn54512-55.1.noarch.rpm"
RPM_HASH = "f24ca472376cb7f3d6f1f18809b9e0a248829e0b5ae4f55665b7038fb41b303f6898dc4d0eabec72f637fc4677a960ca70e5bf2f1fd327bee2bc81bb8863a5ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-countriesofeurope-doc"

RDEPENDS:${PN} += ""

inherit rpm
