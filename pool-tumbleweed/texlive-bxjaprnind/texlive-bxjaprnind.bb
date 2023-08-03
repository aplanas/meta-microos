SUMMARY = "Adjust the position of parentheses at paragraph head"
DESCRIPTION = "In Japanese typesetting, opening parentheses placed at the \
beginning of paragraphs or lines are treated specially; for \
example, while the paragraph indent before normal kanji \
characters is 1em, the indent before parentheses can be 0.5em, \
1em or 1.5em deoending on the local rule in effect."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4asvn59641"

RPM_NAME = "texlive-bxjaprnind-2023.209.0.0.4asvn59641-53.1.noarch.rpm"
RPM_HASH = "63d63a3c81351939390555ff05847dae6ee7414828c307bab1a26518fd7ea02047f07fc97c43fa0ea25698f8f52269dd002a19d9fdae6456d590d99e40b3af61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxjaprnind.sty \
texlive-bxjaprnind"

RDEPENDS:${PN} += "/usr/bin/sh \
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
