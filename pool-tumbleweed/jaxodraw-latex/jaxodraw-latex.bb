SUMMARY = "LaTeX style file axodraw4j.sty for documents generated with jaxodraw"
DESCRIPTION = "This package contains the LaTeX style file that is needed for EPS export \
functionality in jaxodraw. \
 \
You need this if you want the export to EPS function to work or if you want to \
compile LaTeX files generated with jaxodraw."
LICENSE = "LPPL-1.3c"

PV = "2.1.0"

RPM_NAME = "jaxodraw-latex-2.1.0-6.6.noarch.rpm"
RPM_HASH = "0261fb01cad47acab4bf07046af5283f959bacf5c36c10c5615c1bac764a623cac5551f3d0a49b7204daaf648f667d9e26bbcef91058efa65dee06e3a1ebe8f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxodraw-latex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
jaxodraw \
tex-latex \
texlive \
texlive-pst-tools"

inherit rpm
