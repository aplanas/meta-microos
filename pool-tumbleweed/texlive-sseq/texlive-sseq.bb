SUMMARY = "Typesetting spectral sequence charts"
DESCRIPTION = "The package provides commands to draw spectral sequence \
diagrams, providing facilities for clipping and arranging \
multiple symbols so that they do not overlap. The package is \
built using pgf, and shares that systems large demands for TeX \
system memory. Its geometric commands are based on a turtle \
graphics model, and control structures such as loops and \
conditionals are available."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.01svn31585"

RPM_NAME = "texlive-sseq-2023.201.2.01svn31585-57.1.noarch.rpm"
RPM_HASH = "b065b0ea7f9b93fb4c12f0e8dd38887c8d88ba11fbe9dcacfb18f9a8d91840f0475595c73e01161fb88545ed86eaf5dfa6b7e0d964585daaedffca2b8c2228c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sseq.sty \
texlive-sseq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pgf.sty \
tex-pifont.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
