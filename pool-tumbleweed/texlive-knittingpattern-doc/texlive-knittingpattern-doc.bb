SUMMARY = "Documentation for texlive-knittingpattern"
DESCRIPTION = "This package includes the documentation for texlive-knittingpattern"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17205"

RPM_NAME = "texlive-knittingpattern-doc-2023.201.svn17205-55.1.noarch.rpm"
RPM_HASH = "241973d581dc439b268c17a88a2a11b5850ba4a6ab9854c38b2b7c521d97f45861b7457208b44525ba11ee1eb44fa5a19771ae065f27baaef8a169289d75162b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knittingpattern-doc"

RDEPENDS:${PN} += ""

inherit rpm
