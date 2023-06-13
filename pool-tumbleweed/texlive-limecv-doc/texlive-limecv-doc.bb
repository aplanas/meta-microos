SUMMARY = "Documentation for texlive-limecv"
DESCRIPTION = "This package includes the documentation for texlive-limecv"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.12svn61199"

RPM_NAME = "texlive-limecv-doc-2023.201.0.0.1.12svn61199-54.1.noarch.rpm"
RPM_HASH = "dad22b1f72fff8c2ed82a120b610ef58a45bb7fab4aa6a1d666c4352ae80f912410c21fff27b3e7f894d61fb11a051911aed502eb8cab5e5ce07ef13f7b5279e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-limecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
