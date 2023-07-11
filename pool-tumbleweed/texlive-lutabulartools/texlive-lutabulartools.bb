SUMMARY = "Some useful LuaLaTeX-based tabular tools"
DESCRIPTION = "This package provides some useful commands for tabular matter. \
It uses LuaLaTeX and offers the ability to combine the \
facilities of multirow and makecell with an easy to use syntax. \
It also adds some enhanced rules for the booktabs package."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65153"

RPM_NAME = "texlive-lutabulartools-2023.208.svn65153-53.1.noarch.rpm"
RPM_HASH = "54ec9c491dd77840844d140fef930368efac9bc99c05b57b94cdec9744e4c4d6955e1e67d5cde814581c2b137e5d47951bf69004228bd7fbc5192ec15d4059d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lutabulartools.sty \
texlive-lutabulartools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-booktabs.sty \
tex-colortbl.sty \
tex-luacode.sty \
tex-makecell.sty \
tex-multirow.sty \
tex-penlight.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
