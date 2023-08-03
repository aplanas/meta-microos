SUMMARY = "Documentation for texlive-xlop"
DESCRIPTION = "This package includes the documentation for texlive-xlop"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.28svn56910"

RPM_NAME = "texlive-xlop-doc-2023.209.0.0.28svn56910-53.1.noarch.rpm"
RPM_HASH = "af8e2be56225f290ee08ac78552b7996f1886739730aeb11a50a835b7fb5715951f0211050b5401e720e357e9f73924d2c7c787975c23b36875fbaac439138f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xlop-doc-fr;en \
texlive-xlop-doc"

RDEPENDS:${PN} += ""

inherit rpm
