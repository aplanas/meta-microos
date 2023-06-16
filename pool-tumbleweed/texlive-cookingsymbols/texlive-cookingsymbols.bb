SUMMARY = "Symbols for recipes"
DESCRIPTION = "The package provides 11 symbols for typesetting recipes: oven, \
gasstove, topheat, fanoven, gloves and dish symbol (among \
others). The symbols are defined using Metafont."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.1svn35929"

RPM_NAME = "texlive-cookingsymbols-2023.204.1.1svn35929-54.1.noarch.rpm"
RPM_HASH = "af936b99bc613e271f42540ee2f5fbe82184eb4c25aab08c77b1a402b42415a60a76c904d33016444fc654c18cabe3a2c371b8f249a629df631a9517622d459e"
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
