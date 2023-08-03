SUMMARY = "Dodecaphonic diagrams: twelve-tone matrices, clock diagrams, etcetera"
DESCRIPTION = "This is a music-related package which is focused on notation \
from the Twelve-Tone System, also called Dodecaphonism. It \
provides LaTeX algorithms that produce typical dodecaphonic \
notation based off a musical series, or row sequence, of \
variable length. The package requires etoolbox, pgfkeys, TikZ, \
xparse, and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn52009"

RPM_NAME = "texlive-ddphonism-2023.209.0.0.2svn52009-53.1.noarch.rpm"
RPM_HASH = "c374abf23f2d869a275366c846e90e9dde7b2b6f71bca6f454800121078b4ddc2aa00144438884bcafc6eb8e324637e40bea767a06793f8670ecba116a763de3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ddphonism.sty \
texlive-ddphonism"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pgfkeys.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
