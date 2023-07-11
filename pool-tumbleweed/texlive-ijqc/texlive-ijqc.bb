SUMMARY = "BibTeX style file for the Intl. J. Quantum Chem"
DESCRIPTION = "ijqc.bst is a BibTeX style file to support publication in \
Wiley's International Journal of Quantum Chemistry. It is not \
in any way officially endorsed by the publisher or editors, and \
is provided without any warranty one could ever think of."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn15878"

RPM_NAME = "texlive-ijqc-2023.208.1.2svn15878-53.1.noarch.rpm"
RPM_HASH = "92c3224f2c657d0c880bf80c36a02f9b4c9288ca85cee62e702d32412ec9ffd933199f9fe756bf40ca2b7a6ec7bf2dbae351eae9e33b9344a37c06364840ac36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijqc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
