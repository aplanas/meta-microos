SUMMARY = "Manage classical manuscripts with BibLaTeX"
DESCRIPTION = "The package adds a new entry type: @manuscript to manage \
manuscript in classical philology, for example to prepare a \
critical edition."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.2svn53344"

RPM_NAME = "texlive-biblatex-manuscripts-philology-2023.201.2.1.2svn53344-53.1.noarch.rpm"
RPM_HASH = "9682d67b966f9cac093ce3c239049a991b28f08e7c9a59027f5d4916a996ecf80c1c136911e761a28c26c08b6e52b716d144a0f97144529b081f8f2d1ff335c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-english-manuscripts.lbx \
tex-french-manuscripts.lbx \
tex-italian-manuscripts.lbx \
tex-manuscripts-NewBibliographyString.sty \
tex-manuscripts-noautoshorthand.bbx \
tex-manuscripts-shared.bbx \
tex-manuscripts.bbx \
texlive-biblatex-manuscripts-philology"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-english.lbx \
tex-french.lbx \
tex-italian.lbx \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
