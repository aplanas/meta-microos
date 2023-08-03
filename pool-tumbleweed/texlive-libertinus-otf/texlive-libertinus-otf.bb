SUMMARY = "Support for Libertinus OpenType"
DESCRIPTION = "This package offers LuaLaTeX/XeLaTeX support for the Libertinus \
OpenType fonts maintained by Khaled Hosny. Missing fonts are \
defined via several font feature settings. The Libertinus fonts \
are similiar to Libertine and Biolinum, but come with math \
symbols."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.29svn60023"

RPM_NAME = "texlive-libertinus-otf-2023.209.0.0.29svn60023-55.1.noarch.rpm"
RPM_HASH = "9b5d153d595d5857b162b6c9eab13df7973cea3318f6f9c2cb8b1709d5805dc280e4f4959b81243a075d0d5524f7c02fae3377f56d3afac92ac44fb096d4affb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-libertinus-otf.sty \
texlive-libertinus-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-textcomp.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
