SUMMARY = "Documentation for texlive-kvoptions"
DESCRIPTION = "This package includes the documentation for texlive-kvoptions"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.15svn63622"

RPM_NAME = "texlive-kvoptions-doc-2023.209.3.15svn63622-56.1.noarch.rpm"
RPM_HASH = "5f8be46e1ab38dd757d74e63168d7bffbe669111524c2cd450bb0bcbd0d3d898cd9be86b5254a63ab42fbfa948003bc2a4b84ed84c26a56c7653f8c0ccf7c727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kvoptions-doc-en \
texlive-kvoptions-doc"

RDEPENDS:${PN} += ""

inherit rpm
