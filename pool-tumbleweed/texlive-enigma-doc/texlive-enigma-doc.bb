SUMMARY = "Documentation for texlive-enigma"
DESCRIPTION = "This package includes the documentation for texlive-enigma"
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.1svn29802"

RPM_NAME = "texlive-enigma-doc-2023.201.0.0.1svn29802-53.1.noarch.rpm"
RPM_HASH = "0d5c1bdd9789568d1de7e61cbd5fec026a83ff645d10347a91eaf6389aa17140411477478ca188280a7d4d61ae47cfbbe91cd3d0458c3ab9236dd5da24bfc54a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enigma-doc"

RDEPENDS:${PN} += ""

inherit rpm
