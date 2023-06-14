SUMMARY = "Absolute content positioning"
DESCRIPTION = "The package provides commands so that the user of LuaLaTeX may \
position arbitrary content at any position specified by \
absolute coordinates on the page. The package draws a grid on \
each page of the document, to aid positioning (the grid may be \
disabled, for 'final copy' using the command \\placeatsetup)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1d1svn45145"

RPM_NAME = "texlive-placeat-2023.201.0.0.1d1svn45145-51.1.noarch.rpm"
RPM_HASH = "513a3ecd0ab17838816a0e980812082ef4b76c11d587fe938997488cc00e2f6a7ade58023df90c90bddad8f68b0ca99a804bd8b1db1924f55f3848354315f2e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-placeat.sty \
texlive-placeat"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/luatex \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-luacode.sty \
tex-luatexbase.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
