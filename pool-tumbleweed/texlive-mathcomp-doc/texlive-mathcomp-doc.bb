SUMMARY = "Documentation for texlive-mathcomp"
DESCRIPTION = "This package includes the documentation for texlive-mathcomp"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1fsvn15878"

RPM_NAME = "texlive-mathcomp-doc-2023.208.0.0.1fsvn15878-53.1.noarch.rpm"
RPM_HASH = "0a59651d28116c3e5b9b57f90adfbf175ce715b2427e14f87d8ee6ed3c126fa0fd075ee997ec7bbe5690a7ac3f27eecc02b4d125aa97ddfaa5decd0adcd63efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathcomp-doc"

RDEPENDS:${PN} += ""

inherit rpm
