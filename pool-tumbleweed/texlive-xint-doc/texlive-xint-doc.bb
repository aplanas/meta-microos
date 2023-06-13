SUMMARY = "Documentation for texlive-xint"
DESCRIPTION = "This package includes the documentation for texlive-xint"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4msvn63562"

RPM_NAME = "texlive-xint-doc-2023.201.1.4msvn63562-52.1.noarch.rpm"
RPM_HASH = "94faffad47f282b26a48f68693da3a1a74cc26d2c2670a679f13c48935cf71e03e7a834507c9b0bf41061a805971f601e22225bfdc361d937e48c3a2966b3deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xint-doc"

RDEPENDS:${PN} += ""

inherit rpm
