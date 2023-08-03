SUMMARY = "Typeset tram boxes in LaTeX"
DESCRIPTION = "Tram boxes are highlighted with patterns of dots; the package \
defines an environment tram that typesets its content into a \
tram box. The pattern used may be selected in an optional \
argument to the environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn29803"

RPM_NAME = "texlive-tram-2023.209.0.0.2svn29803-53.1.noarch.rpm"
RPM_HASH = "28ff0b1d19758ebb338bbba035f541296305a06d2418526e8fb2a67dcf2250d4df981c74031313c210423a8a6b0c9555c5a409c07acf65c64fbe8f3737976d7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tram.sty \
texlive-tram"

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
