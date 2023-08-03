SUMMARY = "Documentation for texlive-pst-optic"
DESCRIPTION = "This package includes the documentation for texlive-pst-optic"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn62977"

RPM_NAME = "texlive-pst-optic-doc-2023.209.1.02svn62977-53.1.noarch.rpm"
RPM_HASH = "d9bec42bac4685ec6714fff894b176f016ab3255a08a0702fb965caf894b2114d0ed7611836ab3fece409fc71be3a403b094e3a937b16cc4179417510949cb3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-optic-doc"

RDEPENDS:${PN} += ""

inherit rpm
