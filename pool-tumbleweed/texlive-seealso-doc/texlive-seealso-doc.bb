SUMMARY = "Documentation for texlive-seealso"
DESCRIPTION = "This package includes the documentation for texlive-seealso"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn43595"

RPM_NAME = "texlive-seealso-doc-2023.201.1.2svn43595-53.1.noarch.rpm"
RPM_HASH = "7b74f970c26a8ce8e8ff20fa03e1163f510ce9658ffc38cdbd258bdb737e0c13037aece6d64dd0d9e0f0f2a8a062e9c60e1102735b5dac582f7c17dee6e89487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seealso-doc"

RDEPENDS:${PN} += ""

inherit rpm
