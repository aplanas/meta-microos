SUMMARY = "Documentation for texlive-revtex"
DESCRIPTION = "This package includes the documentation for texlive-revtex"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2esvn56591"

RPM_NAME = "texlive-revtex-doc-2023.201.4.2esvn56591-53.2.noarch.rpm"
RPM_HASH = "fb7fcd3c2ed50e93610aa30ff9c5a74fa310a73b34db80d19ff0c0cb214bea3e334a2ba68871b43248cfd6a0b591cc77afb6120865f1005f50e7473b609b356e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
