SUMMARY = "Highlight text passages that need further work"
DESCRIPTION = "This package provides a single command \\tbd which highlights \
the pieces of text that need to be rewritten later. You can \
hide them all with a single package option hide, or just make \
them disappear entirely with the option off."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn64882"

RPM_NAME = "texlive-to-be-determined-2023.201.0.0.3.0svn64882-52.1.noarch.rpm"
RPM_HASH = "a7dcc73fe9cb0b5b2de934bd47eb0d54522e2e5160308b5000682acde41b284decfc06f2f7b308800de250455fdc55fafdfbbd0e9046c5113312fe3c2e0dd4dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-to-be-determined.sty \
texlive-to-be-determined"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-soul.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-soul \
texlive-xcolor"

inherit rpm
