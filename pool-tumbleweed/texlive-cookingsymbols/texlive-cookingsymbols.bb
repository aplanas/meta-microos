SUMMARY = "Symbols for recipes"
DESCRIPTION = "The package provides 11 symbols for typesetting recipes: oven, \
gasstove, topheat, fanoven, gloves and dish symbol (among \
others). The symbols are defined using Metafont."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn35929"

RPM_NAME = "texlive-cookingsymbols-2023.209.1.1svn35929-55.1.noarch.rpm"
RPM_HASH = "df0981a8108f39f2002a386ff25b4e0fc090665d86a10a49bae79686aeccdad837e5b86f58d9b659fffc2dafcd17e73d1195fab82dd433fbe16ac216280b13a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cookingsymbols.sty \
tex-cookingsymbols.tfm \
texlive-cookingsymbols"

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
