SUMMARY = "Documentation for texlive-tudscr"
DESCRIPTION = "This package includes the documentation for texlive-tudscr"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.06osvn64085"

RPM_NAME = "texlive-tudscr-doc-2023.209.2.06osvn64085-53.1.noarch.rpm"
RPM_HASH = "62d1355ed723ef049f0bb0bfd826293319719eb0ef195ff73d18cd7e418a84397335b81f52dece38d20b1e160cace5a942659e48c5c0dfc6661f0310706dd6b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tudscr-doc-de \
texlive-tudscr-doc"

RDEPENDS:${PN} += ""

inherit rpm
