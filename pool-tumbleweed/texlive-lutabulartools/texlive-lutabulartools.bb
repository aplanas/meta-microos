SUMMARY = "Some useful LuaLaTeX-based tabular tools"
DESCRIPTION = "This package provides some useful commands for tabular matter. \
It uses LuaLaTeX and offers the ability to combine the \
facilities of multirow and makecell with an easy to use syntax. \
It also adds some enhanced rules for the booktabs package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65153"

RPM_NAME = "texlive-lutabulartools-2023.201.svn65153-52.1.noarch.rpm"
RPM_HASH = "57dcf9c5cdc1087f8320e0d5eac06c91eac301619c87918ac454f679c87d41c48c803e3c10827ba90476dd38d4975fb04ed543cde60eae57b72390feade612b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lutabulartools.sty) \
texlive-lutabulartools"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(booktabs.sty) \
tex(colortbl.sty) \
tex(luacode.sty) \
tex(makecell.sty) \
tex(multirow.sty) \
tex(penlight.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
