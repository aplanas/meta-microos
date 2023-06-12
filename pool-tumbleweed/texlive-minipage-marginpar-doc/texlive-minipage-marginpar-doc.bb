SUMMARY = "Documentation for texlive-minipage-marginpar"
DESCRIPTION = "This package includes the documentation for texlive-minipage-marginpar"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-minipage-marginpar-doc-2023.201.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "6b1aa29a2f13ee35aa1238aa61182ea832ebc03d2819ed358d279563dcffb66243957b81631d95762378f3cecd33c6c783b7854f0982113aa85130b062261552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-minipage-marginpar-doc:de) \
texlive-minipage-marginpar-doc"
RDEPENDS:${PN} += ""

inherit rpm
