SUMMARY = "Babel support for Georgian"
DESCRIPTION = "The package provides support for use of Babel in documents \
written in Georgian. The package is adapted for use both under \
'traditional' TeX engines, and under XeTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn45864"

RPM_NAME = "texlive-babel-georgian-2023.209.2.2svn45864-54.1.noarch.rpm"
RPM_HASH = "1e1dbe563b2e0290dd4b17f4f28eab17de5b46a14b25c68250cd357f87d2ac28c7ed9ad97b01e8d1db4b8df7595fdc5d351877a531cbc0c3c533f12c17983535"
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
