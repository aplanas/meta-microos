SUMMARY = "BibTeX style file for the Intl. J. Quantum Chem"
DESCRIPTION = "ijqc.bst is a BibTeX style file to support publication in \
Wiley's International Journal of Quantum Chemistry. It is not \
in any way officially endorsed by the publisher or editors, and \
is provided without any warranty one could ever think of."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-ijqc-2023.209.1.2svn15878-54.1.noarch.rpm"
RPM_HASH = "d8a0c4af4d6404ed16a4c28b25e12125f470af6d6c258ab8e05dea9132db6087ca29fca8f2260b4d76224059cb9483a8a799ac8082acc60ca94f53985db6d0a6"
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
