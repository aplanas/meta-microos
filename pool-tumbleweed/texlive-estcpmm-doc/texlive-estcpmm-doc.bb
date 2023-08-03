SUMMARY = "Documentation for texlive-estcpmm"
DESCRIPTION = "This package includes the documentation for texlive-estcpmm"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn17335"

RPM_NAME = "texlive-estcpmm-doc-2023.209.0.0.4svn17335-53.1.noarch.rpm"
RPM_HASH = "405b68d9e649d193adafd4fe86f51edb9a10261888a19a6af2524a7994c1c6678eb05c8c99bea336ea1029350c26d71fa5734ddf25f287fe0ad29d7a02487d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-estcpmm-doc"

RDEPENDS:${PN} += ""

inherit rpm
