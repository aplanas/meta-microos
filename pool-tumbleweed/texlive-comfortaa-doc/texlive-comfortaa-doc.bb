SUMMARY = "Documentation for texlive-comfortaa"
DESCRIPTION = "This package includes the documentation for texlive-comfortaa"
LICENSE = "OFL-1.1"

PV = "2023.201.3.2svn54512"

RPM_NAME = "texlive-comfortaa-doc-2023.201.3.2svn54512-53.1.noarch.rpm"
RPM_HASH = "a50062f5a7e71abe8e2f692faf140123991cf4677f717b0b7ce4183b53f2b7b987861460814557058fba9d011ad9cf93765fba22f2379d677d326e9dde9c67f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comfortaa-doc"

RDEPENDS:${PN} += ""

inherit rpm
