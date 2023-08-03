SUMMARY = "Provide 'turn page' instructions"
DESCRIPTION = "The package prints a 'turn' instruction at the bottom of \
odd-numbered pages (except the last). This is a common \
convention for examination papers and the like."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3asvn29803"

RPM_NAME = "texlive-turnthepage-2023.209.1.3asvn29803-53.1.noarch.rpm"
RPM_HASH = "6010fc82873ee7ed1a99f5032115224c755a814077c254e432e8fc9171ae0c33f3a907ce7d1996c495108bc6e3bd2042d0ba3c0f8d07cd3bc35d8fb29c22ed12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turnpageetex.sty \
tex-turnpagewoetex.sty \
tex-turnthepage.sty \
texlive-turnthepage"

RDEPENDS:${PN} += "/usr/bin/sh \
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
