SUMMARY = "A macro for centering lines"
DESCRIPTION = "This package provides a macro \\centeredline{...} which allows \
to conveniently center a line inside a paragraph while allowing \
usage therein of \\verb or other macros changing catcodes. It \
works nicely in list environments, and material whose natural \
width exceeds the current linewidth will get properly centered \
too."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn64672"

RPM_NAME = "texlive-centeredline-2023.209.1.2svn64672-53.1.noarch.rpm"
RPM_HASH = "9f69c38572073f8341b97ef2d82b6b15bc50ee1bd0a51260857f59bd384a48413b361d29d8b077d6dd08c09975b14ad663a0b4e1df94ad4d8f2a1da652bf947c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-centeredline.sty \
texlive-centeredline"

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
