SUMMARY = "Article format for publishing the Basque Country Science and Technology Journal 'Ekaia'"
DESCRIPTION = "The package provides the article format for publishing the \
Basque Country Science and Technology Journal 'Ekaia' at the \
University of the Basque Country."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn49594"

RPM_NAME = "texlive-ekaia-2023.209.1.06svn49594-54.2.noarch.rpm"
RPM_HASH = "f58904bd2be21fbff41d1ab9ae2b69faf706799bc3aa52beabd949cccd64bfb76d085b1d4b96fba18a193a84d46534df69c2e9729a1c906060dbf15bb86feae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ekaia.sty \
texlive-ekaia"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-basque-date.sty \
tex-ccicons.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-indentfirst.sty \
tex-sectsty.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
