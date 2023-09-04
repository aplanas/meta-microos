SUMMARY = "Documentation for texlive-gzt"
DESCRIPTION = "This package includes the documentation for texlive-gzt"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.3svn63591"

RPM_NAME = "texlive-gzt-doc-2023.209.1.1.3svn63591-54.2.noarch.rpm"
RPM_HASH = "aa292d1c2f9fe7b0e20de23f7c3806c0dea34ea5e5e55cd781825d199e7a3297956ab5b7d321b0634ca097e3d50c2d8429935dab4eed6b3245228e30f65496db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gzt-doc-fr \
texlive-gzt-doc"

RDEPENDS:${PN} += ""

inherit rpm
