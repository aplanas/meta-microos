SUMMARY = "Documentation for texlive-xcomment"
DESCRIPTION = "This package includes the documentation for texlive-xcomment"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn20031"

RPM_NAME = "texlive-xcomment-doc-2023.201.1.3svn20031-52.2.noarch.rpm"
RPM_HASH = "02fc411b6c363f1e01f98e665264a3e093df0d0672d5d99e16d6a01074b03936eadbb0c7f59d7a10e25d1e28cda0b33916c7cd8f6191a09e831810c4e8d37666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcomment-doc"

RDEPENDS:${PN} += ""

inherit rpm
