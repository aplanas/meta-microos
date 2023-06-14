SUMMARY = "Adjust the position of parentheses at paragraph head"
DESCRIPTION = "In Japanese typesetting, opening parentheses placed at the \
beginning of paragraphs or lines are treated specially; for \
example, while the paragraph indent before normal kanji \
characters is 1em, the indent before parentheses can be 0.5em, \
1em or 1.5em deoending on the local rule in effect."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4asvn59641"

RPM_NAME = "texlive-bxjaprnind-2023.201.0.0.4asvn59641-52.1.noarch.rpm"
RPM_HASH = "a96fdca784843f4909f35c73f5cbed101baf5980102868b01f144112dbb9cd77d8852c60a99d01a781c713e4cc017b6024ed9b1664dc2ab03b03ccd0c38ef7cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxjaprnind.sty \
texlive-bxjaprnind"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bxtoolbox.sty \
tex-everyhook.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
