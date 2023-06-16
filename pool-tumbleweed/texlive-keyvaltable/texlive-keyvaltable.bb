SUMMARY = "Re-usable table layouts separating content and presentation"
DESCRIPTION = "The main goal of this package is to offer means for typesetting \
tables easily and yet still looking rather nicely in a way that \
separates content from presentation and with re-usable layout \
for tables of the same type. For this purpose, the package \
provides the environment KeyValTable, which allows one to \
typeset tables that have a previously defined column layout and \
whose rows can be produced in a key-value fashion."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn65416"

RPM_NAME = "texlive-keyvaltable-2023.201.2.3svn65416-55.1.noarch.rpm"
RPM_HASH = "48be8995380dc73d337fdc390cbeaf3fa348be3dd10c8aaf80767c027415aec769873b875e39c069118810a1cdf63a1e29d79f510a0cc12600682bd808951d22"
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
