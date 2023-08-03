SUMMARY = "Documentation for texlive-tabularcalc"
DESCRIPTION = "This package includes the documentation for texlive-tabularcalc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-tabularcalc-doc-2023.209.0.0.2svn15878-55.1.noarch.rpm"
RPM_HASH = "8f709a49d39c84e1d1e6ff3906fff353e4f5eb4833be2f10c7ef695c5b2c3dc6966edc3283f8d3f9cd103178ae169efed960c128246d4896d025c4f29ac5b630"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tabularcalc-doc-en;fr \
texlive-tabularcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
