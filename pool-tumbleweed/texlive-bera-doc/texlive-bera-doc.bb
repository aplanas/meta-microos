SUMMARY = "Documentation for texlive-bera"
DESCRIPTION = "This package includes the documentation for texlive-bera"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20031"

RPM_NAME = "texlive-bera-doc-2023.209.svn20031-54.1.noarch.rpm"
RPM_HASH = "8df449d8cdad1063b5fd38b44b5db74cecd9a3a5cd4febb23ab087727a4e0f05d206bfd5fa4e55f05199bfa23747fe2e0835298b1bdd9dd9597bb49cb92fcb59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bera-doc"

RDEPENDS:${PN} += ""

inherit rpm
