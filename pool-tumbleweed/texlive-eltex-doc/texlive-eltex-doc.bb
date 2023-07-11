SUMMARY = "Documentation for texlive-eltex"
DESCRIPTION = "This package includes the documentation for texlive-eltex"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-eltex-doc-2023.201.2.0svn15878-53.2.noarch.rpm"
RPM_HASH = "9fbd28617a334c2f91615744f1798fc1a8c11ffb1081d489a06fba354aeb2284702bf66065ba1122827b49eb2f1a94916f067f4cdc29b1a9d4d2310546e8e81b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-eltex-doc-en;cs \
texlive-eltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
