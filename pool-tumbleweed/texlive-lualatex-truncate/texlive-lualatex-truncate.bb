SUMMARY = "A wrapper for using the truncate package with LuaLaTeX"
DESCRIPTION = "This package provides a wrapper for the truncate package, thus \
fixing issues related to LuaTeX's hyphenation algorithm."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn48469"

RPM_NAME = "texlive-lualatex-truncate-2023.208.1.1svn48469-53.1.noarch.rpm"
RPM_HASH = "247bec82d05d17becb247f7094ba7936420ee26204ba1dfb9cde82a416e6a43935e80b270c84777123429acf1277baa145ba361ae9430e910b105dc78cdfd415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lualatex-truncate.sty \
texlive-lualatex-truncate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-letltxmacro.sty \
tex-truncate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
