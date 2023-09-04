SUMMARY = "Check if the engine is pTeX or one of its derivatives"
DESCRIPTION = "The ifptex package is a counterpart of ifxetex, ifluatex, etc. \
for the ptex engine. The ifuptex package is an alias to ifptex \
provided for backward compatibility."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn62982"

RPM_NAME = "texlive-ifptex-2023.209.2.2svn62982-54.1.noarch.rpm"
RPM_HASH = "c2c6ca3df9249dd4778df19b64c27f0ab5c9bceea6b46bec49bef9f9de5aff58382821e70c7e3037c415718dbc7cc473490e739166424b93160507d842f9d84e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifptex.sty \
tex-ifuptex.sty \
texlive-ifptex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
