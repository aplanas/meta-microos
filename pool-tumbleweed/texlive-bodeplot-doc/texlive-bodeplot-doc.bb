SUMMARY = "Documentation for texlive-bodeplot"
DESCRIPTION = "This package includes the documentation for texlive-bodeplot"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.3svn65074"

RPM_NAME = "texlive-bodeplot-doc-2023.209.1.1.3svn65074-53.1.noarch.rpm"
RPM_HASH = "47f8c33a58950b6ea76041d9a29a60a2620a82624bdb04a4ea4de8da5c782d18ab1142af9e4ecec4db3258488ec4e28b232d20c075e68286ade8bb54e103ee26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bodeplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
