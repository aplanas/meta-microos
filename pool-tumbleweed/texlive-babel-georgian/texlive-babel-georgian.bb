SUMMARY = "Babel support for Georgian"
DESCRIPTION = "The package provides support for use of Babel in documents \
written in Georgian. The package is adapted for use both under \
'traditional' TeX engines, and under XeTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn45864"

RPM_NAME = "texlive-babel-georgian-2023.201.2.2svn45864-53.1.noarch.rpm"
RPM_HASH = "78c368db60af6ad2f85717e11cd8e5be2a8b4828e61389e108b659f9d61b40d9f8e0805056fc65e8ea6d0e4a6fbdb9293487937359e82fa4d1940e830cfb3907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-georgian.ldf \
tex-georgian.sty \
tex-georgiancaps.tex \
texlive-babel-georgian"

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
