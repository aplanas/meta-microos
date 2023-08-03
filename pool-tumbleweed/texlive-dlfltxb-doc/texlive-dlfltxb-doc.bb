SUMMARY = "Documentation for texlive-dlfltxb"
DESCRIPTION = "This package includes the documentation for texlive-dlfltxb"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17337"

RPM_NAME = "texlive-dlfltxb-doc-2023.209.svn17337-53.1.noarch.rpm"
RPM_HASH = "84b9cad0d2c8a1928449108710ad424134ff3032583408f20642f93913c66a7fc4bc3c2ad49a24c30524298c1efad04bf3759f2c69e0bbc5ebaa0a5e08700ee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dlfltxb-doc"

RDEPENDS:${PN} += ""

inherit rpm
