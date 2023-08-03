SUMMARY = "Pretty-print Metafont source"
DESCRIPTION = "The mft program pretty-prints Metafont source code into a TeX \
file. The mftinc package facilitates incorporating such files \
into a LaTeX2e document. In addition, mftinc provides routines \
for improved comment formatting and for typesetting font \
tables."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn15878"

RPM_NAME = "texlive-mftinc-2023.209.1.0asvn15878-55.1.noarch.rpm"
RPM_HASH = "4d069294fb06024be69850d38b3a1ad0be56cbf24bfcde8931a400685ab76b42c2e21c97d1f4b5379218cc47fd60917357f9990a25752cf6d6b1e6a5ecbc1567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mftinc.sty \
texlive-mftinc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chngpage.sty \
tex-keyval.sty \
tex-lineno.sty \
tex-rawfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
