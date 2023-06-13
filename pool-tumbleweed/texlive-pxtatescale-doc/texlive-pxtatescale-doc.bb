SUMMARY = "Documentation for texlive-pxtatescale"
DESCRIPTION = "This package includes the documentation for texlive-pxtatescale"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn63967"

RPM_NAME = "texlive-pxtatescale-doc-2023.201.0.0.4svn63967-53.1.noarch.rpm"
RPM_HASH = "8dc698d7df8a0c25738945d6b73e88dc24cd87a30c20b1a8911cb556676855f20e6be8a198ca09ee02a2f602947359e7285a8d8ba7e4b6a826523d93e9e77ce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxtatescale-doc"

RDEPENDS:${PN} += ""

inherit rpm
