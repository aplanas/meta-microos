SUMMARY = "Provide 'turn page' instructions"
DESCRIPTION = "The package prints a 'turn' instruction at the bottom of \
odd-numbered pages (except the last). This is a common \
convention for examination papers and the like."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn29803"

RPM_NAME = "texlive-turnthepage-2023.201.1.3asvn29803-52.1.noarch.rpm"
RPM_HASH = "56c579bed766787b161158c5eeae67dbd193228e4474e1f9d690195dc173057163764af937cd41b68298a1483207e830d4b9ab7e3291fba316ea231ce9bff2df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turnpageetex.sty \
tex-turnpagewoetex.sty \
tex-turnthepage.sty \
texlive-turnthepage"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-atbegshi.sty \
tex-pageslts.sty \
tex-picture.sty \
tex-zref-abspage.sty \
tex-zref-lastpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
