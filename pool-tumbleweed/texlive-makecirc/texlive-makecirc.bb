SUMMARY = "A MetaPost library for drawing electrical circuit diagrams"
DESCRIPTION = "MakeCirc is a MetaPost library that contains diverse symbols \
for use in circuit diagrams. MakeCirc offers a high quality \
tool, with a simple syntax. MakeCirc is completely integrated \
with LaTeX documents and with other MetaPost drawing/graphic. \
Its output is a PostScript file. MakeCirc only requires (La)TeX \
and MetaPost to work."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-makecirc-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "b5bf04f9304f5b24e8c5ea9d9cf465fa22fc3f277dd0ccdd29acdeb8a2a1633f6ac24a6121d930ef3c64bce7c8c6d8452c60d11a24f2f5a5f6e873dd0952baee"
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
