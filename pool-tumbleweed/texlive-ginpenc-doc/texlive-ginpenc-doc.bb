SUMMARY = "Documentation for texlive-ginpenc"
DESCRIPTION = "This package includes the documentation for texlive-ginpenc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24980"

RPM_NAME = "texlive-ginpenc-doc-2023.201.1.0svn24980-52.1.noarch.rpm"
RPM_HASH = "390537ac499f9abecd7afe8ef3d0ce425d925146d8c739f0f3e95eb80b286bc786bd21a95bd2b3f615986a7dd415942d8b293833c5f0b632b31f24fb8c9361ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ginpenc-doc"
RDEPENDS:${PN} += ""

inherit rpm
