SUMMARY = "Documentation for texlive-revtex"
DESCRIPTION = "This package includes the documentation for texlive-revtex"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2esvn56591"

RPM_NAME = "texlive-revtex-doc-2023.201.4.2esvn56591-53.1.noarch.rpm"
RPM_HASH = "ed053130790be37fcced25e57c76b7b47a09895b81423ad655da144a60946f987610569902a492c0d629600edcb68222378c38d2121e595d476a1a65093f13cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
