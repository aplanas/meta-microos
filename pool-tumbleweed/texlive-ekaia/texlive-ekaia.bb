SUMMARY = "Article format for publishing the Basque Country Science and Technology Journal 'Ekaia'"
DESCRIPTION = "The package provides the article format for publishing the \
Basque Country Science and Technology Journal 'Ekaia' at the \
University of the Basque Country."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn49594"

RPM_NAME = "texlive-ekaia-2023.201.1.06svn49594-53.1.noarch.rpm"
RPM_HASH = "6b9f04ba13f5de57efeebb97d6e5a336c8f7d84df747c279deacfd582a0996355526ee8e1f2e105a5e889749683500584944188239a69fd79f232cdaecc3be95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ekaia.sty) \
texlive-ekaia"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(basque-date.sty) \
tex(ccicons.sty) \
tex(fancyhdr.sty) \
tex(geometry.sty) \
tex(indentfirst.sty) \
tex(sectsty.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
