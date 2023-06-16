SUMMARY = "A macro for centering lines"
DESCRIPTION = "This package provides a macro \\centeredline{...} which allows \
to conveniently center a line inside a paragraph while allowing \
usage therein of \\verb or other macros changing catcodes. It \
works nicely in list environments, and material whose natural \
width exceeds the current linewidth will get properly centered \
too."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn64672"

RPM_NAME = "texlive-centeredline-2023.201.1.2svn64672-52.1.noarch.rpm"
RPM_HASH = "298b2cfd5709e8dbb66c6ba44c3371e3dc6cbcb8b4b926147b7f56d65c536e3b9bb797031bdfa7f704a5fb94893cd3132a59ffdf823f02af12d38e519e301a2d"
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
