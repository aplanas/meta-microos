SUMMARY = "Documentation for texlive-tablvar"
DESCRIPTION = "This package includes the documentation for texlive-tablvar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn51543"

RPM_NAME = "texlive-tablvar-doc-2023.209.1.2svn51543-55.1.noarch.rpm"
RPM_HASH = "a9e0c74041cae702765273a073a8c911ee58afbfbbefb9460613c79d6f9b05878a838be5631ce56403e7c85e01dd6db6e939dccf244282f7e0b7364d91e94508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tablvar-doc-fr \
texlive-tablvar-doc"

RDEPENDS:${PN} += ""

inherit rpm
