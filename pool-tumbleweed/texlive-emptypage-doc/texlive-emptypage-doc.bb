SUMMARY = "Documentation for texlive-emptypage"
DESCRIPTION = "This package includes the documentation for texlive-emptypage"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn18064"

RPM_NAME = "texlive-emptypage-doc-2023.201.1.2svn18064-53.1.noarch.rpm"
RPM_HASH = "0d6cd8cc6af8a424c34391fb4ae7c205926a7fb9ca2221e45c5d4a39fddc33deca1167f08c89ada67b420a27d24e938b0cd0e79290b98cec3c2731b6c4d7b0d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emptypage-doc"

RDEPENDS:${PN} += ""

inherit rpm
