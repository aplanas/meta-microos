SUMMARY = "Helps to type the pronunciation of English words"
DESCRIPTION = "This package provides macros beginning with the PS character, \
made active, which enable us to write the British or American \
English pronunciation as one can find it in the 'English \
Pronouncing Dictionary' by Daniel Jones. There is an option to \
typeset the pronunciation in the style of Harrap's dictionary."
LICENSE = "LPPL-1.0"

PV = "2023.209.2svn16558"

RPM_NAME = "texlive-engpron-2023.209.2svn16558-54.2.noarch.rpm"
RPM_HASH = "c32c4301324c21977cd7336c2fa91f76df5a185e15e63f162a0afb24df36315a6c3fd271949dd3cf3fdd954c516a1fbc55a155eae54417c06c2e9f7ce8d74a71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-engpron-tools.sty \
tex-engpron.sty \
texlive-engpron"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-drac.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
tex-tipa.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
