SUMMARY = "Documentation for texlive-invoice-class"
DESCRIPTION = "This package includes the documentation for texlive-invoice-class"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn49749"

RPM_NAME = "texlive-invoice-class-doc-2023.209.1.0svn49749-54.1.noarch.rpm"
RPM_HASH = "4db0b4ccfe004de6552870941e7c70e8ef43b65b51aa247a009868e49b631486a0fb23fe45df3e4fed9fa49f4994b24ff2a5b6ad20694e0c52fd823401394280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-invoice-class-doc"

RDEPENDS:${PN} += ""

inherit rpm
