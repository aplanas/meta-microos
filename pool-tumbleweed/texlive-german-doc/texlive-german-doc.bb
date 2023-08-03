SUMMARY = "Documentation for texlive-german"
DESCRIPTION = "This package includes the documentation for texlive-german"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5esvn42428"

RPM_NAME = "texlive-german-doc-2023.209.2.5esvn42428-53.1.noarch.rpm"
RPM_HASH = "2b412017e2a11e536f5cfd5864e54bdf61b6ff210bcf16be15733c9d949e26a41c78d0a2ecb7e2d95d2d813f96490e94267ebae7cb2e7f2b1f9c224b55b7a4a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-german-doc-de \
texlive-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
