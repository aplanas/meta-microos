SUMMARY = "Documentation for texlive-imakeidx"
DESCRIPTION = "This package includes the documentation for texlive-imakeidx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3esvn42287"

RPM_NAME = "texlive-imakeidx-doc-2023.201.1.3esvn42287-52.1.noarch.rpm"
RPM_HASH = "9965d08791759326bf6cfe0c65f3d09a954e7a011ad8f16739ed517114343055a88c7c9ec34abadd1522b0589bd7c10398e246b94f6200f04922b6beef0c7cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imakeidx-doc"
RDEPENDS:${PN} += ""

inherit rpm
