SUMMARY = "A handwriting script font"
DESCRIPTION = "The BrushScript font simulates hand-written characters; it is \
distributed in Adobe Type 1 format (but is available in italic \
shape only). The package includes the files needed by LaTeX in \
order to use that font. The file AAA_readme.tex fully describes \
the package and sample.tex illustrates its use."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn28363"

RPM_NAME = "texlive-brushscr-2023.201.svn28363-52.1.noarch.rpm"
RPM_HASH = "3191a164162df074a31d59a21391e2a288e413a114488b25427e4c408bf11aa98874670130da578c071f75d2395ac103e7a8085d05690c8f4b28d3ebf942a415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pbsi.map) \
tex(pbsi.sty) \
tex(pbsi.tfm) \
tex(pbsi8r.tfm) \
tex(pbsi8t.tfm) \
tex(pbsi8t.vf) \
tex(t1pbsi.fd) \
texlive-brushscr"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-brushscr-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
