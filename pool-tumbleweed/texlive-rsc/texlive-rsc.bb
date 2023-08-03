SUMMARY = "BibTeX style for use with RSC journals"
DESCRIPTION = "The rsc package provides a BibTeX style in accordance with the \
requirements of the Royal Society of Chemistry. It was \
originally based on the file pccp.bst, but also implements a \
number of styles from the achemso package. The package is now a \
stub for the chemstyle package, which the author developed to \
unify the writing of articles with a chemistry content."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1fsvn41923"

RPM_NAME = "texlive-rsc-2023.209.3.1fsvn41923-54.1.noarch.rpm"
RPM_HASH = "76e6cf309e929aa6cef7327b50f2b57776d067c4f4ec2d61ec1835a426df67137b91e1584635470cb3b9eb81362581a375b642947e99f67ca1abaa17b39f0ad4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rsc.sty \
texlive-rsc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-mciteplus.sty \
tex-natbib.sty \
tex-natmove.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
