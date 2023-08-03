SUMMARY = "Re-usable table layouts separating content and presentation"
DESCRIPTION = "The main goal of this package is to offer means for typesetting \
tables easily and yet still looking rather nicely in a way that \
separates content from presentation and with re-usable layout \
for tables of the same type. For this purpose, the package \
provides the environment KeyValTable, which allows one to \
typeset tables that have a previously defined column layout and \
whose rows can be produced in a key-value fashion."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn65416"

RPM_NAME = "texlive-keyvaltable-2023.209.2.3svn65416-56.1.noarch.rpm"
RPM_HASH = "92b55c9d5b094c74842aea06e4fa4272b0e77a92b127ef2c964f9be72476c2effdb8baf238fb3b203a7d2d5252ea875411a358b6aed0ab7e765afdac33554345"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyvaltable.sty \
texlive-keyvaltable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-colortbl.sty \
tex-etoolbox.sty \
tex-trimspaces.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
