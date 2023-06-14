SUMMARY = "Documentation for texlive-iwhdp"
DESCRIPTION = "This package includes the documentation for texlive-iwhdp"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.50svn37552"

RPM_NAME = "texlive-iwhdp-doc-2023.201.0.0.50svn37552-55.1.noarch.rpm"
RPM_HASH = "8a4e9ddc617543c6529019370ae5a33093bdf247bf4bd28d8c0a4c0887e69ff0dc68992e53e246802a911698531b20da5c088e1449429818249fcecf5311a3fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-iwhdp-doc-de \
texlive-iwhdp-doc"

RDEPENDS:${PN} += ""

inherit rpm
