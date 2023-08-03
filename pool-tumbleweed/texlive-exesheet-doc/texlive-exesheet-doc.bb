SUMMARY = "Documentation for texlive-exesheet"
DESCRIPTION = "This package includes the documentation for texlive-exesheet"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn65577"

RPM_NAME = "texlive-exesheet-doc-2023.209.2.0svn65577-53.1.noarch.rpm"
RPM_HASH = "d57a535e1880d92aa6dd739e9a2024430fe9a866dfb081fc5b6ea148353374196eab4b0eefb550c979904750b655c625d4b7dc98a49dc394f4e6ed72db3dd756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exesheet-doc"

RDEPENDS:${PN} += ""

inherit rpm
