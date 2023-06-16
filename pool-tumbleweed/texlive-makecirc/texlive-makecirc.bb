SUMMARY = "A MetaPost library for drawing electrical circuit diagrams"
DESCRIPTION = "MakeCirc is a MetaPost library that contains diverse symbols \
for use in circuit diagrams. MakeCirc offers a high quality \
tool, with a simple syntax. MakeCirc is completely integrated \
with LaTeX documents and with other MetaPost drawing/graphic. \
Its output is a PostScript file. MakeCirc only requires (La)TeX \
and MetaPost to work."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-makecirc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "896c4bb4dacff7726d5e6e0d33b119b999f839a438c02ff52316634135b6bbdb4777cbe05e9647bf3d488edba7281d81a8045d485290d4f880d26571966809c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makecirc"

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
