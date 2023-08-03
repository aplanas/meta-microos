SUMMARY = "Graphical and textual clocks for TeX and LaTeX"
DESCRIPTION = "Features graphical clocks (with a classical 12h dial and two \
hands) and text clocks (in 24h format) which can show system \
time or any time the user desires. Works with both TeX and \
LaTeX. The clock faces (appearances of the dial) are easily \
expandable; the default uses a custom Metafont font."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-clock-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "247344b54863f1bafc0265a2a6a31880b1a59ae44927951c63801f7c252f009170d45c4ad7c1300a23362d08ba90c8e29a26d89e1ae578d9ef1acc6c29fcfec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clock.sty \
tex-clock.tex \
tex-clock.tfm \
texlive-clock"

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
