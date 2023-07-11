SUMMARY = "Documentation for texlive-glossaries-extra"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-extra"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.50svn64973"

RPM_NAME = "texlive-glossaries-extra-doc-2023.201.1.50svn64973-53.2.noarch.rpm"
RPM_HASH = "772989b5c59bf45c685f9fba3f14a0e660699c6733987e1f8301f89bfa7b3a6138161a49f66edc8f6be8a6d6704c72fa6127287f2209cb4dab8ec78484d2e456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
