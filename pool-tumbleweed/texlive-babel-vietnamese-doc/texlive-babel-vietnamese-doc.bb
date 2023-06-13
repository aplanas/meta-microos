SUMMARY = "Documentation for texlive-babel-vietnamese"
DESCRIPTION = "This package includes the documentation for texlive-babel-vietnamese"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn39246"

RPM_NAME = "texlive-babel-vietnamese-doc-2023.201.1.4svn39246-53.1.noarch.rpm"
RPM_HASH = "503e4a17152a2ee7697ba35fe1ab0d1786a5f73449aa2c7199b10916525d52a95c9839338c18d1f505767c95310a08fed9d4fae0eeb523c55c680699dc46ef46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-vietnamese-doc"

RDEPENDS:${PN} += ""

inherit rpm
