SUMMARY = "Documentation for texlive-mathcomp"
DESCRIPTION = "This package includes the documentation for texlive-mathcomp"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1fsvn15878"

RPM_NAME = "texlive-mathcomp-doc-2023.201.0.0.1fsvn15878-52.1.noarch.rpm"
RPM_HASH = "86c3b2079ed49d0042ce28b1187099076b94f202970b8aec5b19cc1daf1052eee82642f00768bbdfa76393c7699cdb5f6bf8c45a355937b847de71f910187da7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathcomp-doc"
RDEPENDS:${PN} += ""

inherit rpm
