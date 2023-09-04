SUMMARY = "Documentation for texlive-glossaries-finnish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-finnish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-glossaries-finnish-doc-2023.209.1.0svn54080-54.2.noarch.rpm"
RPM_HASH = "9b781e6ed0e5d9d5ecb08569fe1203ebba190db880a8f695a91c3b5647fbf5070395d8ad72d85ca65bc825d606556bdc7323f785547a2064374965f7cdadb093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-finnish-doc"

RDEPENDS:${PN} += ""

inherit rpm
