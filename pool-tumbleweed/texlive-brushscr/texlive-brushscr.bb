SUMMARY = "A handwriting script font"
DESCRIPTION = "The BrushScript font simulates hand-written characters; it is \
distributed in Adobe Type 1 format (but is available in italic \
shape only). The package includes the files needed by LaTeX in \
order to use that font. The file AAA_readme.tex fully describes \
the package and sample.tex illustrates its use."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn28363"

RPM_NAME = "texlive-brushscr-2023.209.svn28363-53.1.noarch.rpm"
RPM_HASH = "fbd677461b0d0dd4ee00d9c13297546e71f08894391e9831a31bad11912cdb9e8ccf40ab7963a7076a6926bf852bef0cc46465d1af237d8f766ab3b5c4a27e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pbsi.map \
tex-pbsi.sty \
tex-pbsi.tfm \
tex-pbsi8r.tfm \
tex-pbsi8t.tfm \
tex-pbsi8t.vf \
tex-t1pbsi.fd \
texlive-brushscr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-brushscr-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
