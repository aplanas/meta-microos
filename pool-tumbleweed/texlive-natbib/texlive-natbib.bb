SUMMARY = "Flexible bibliography support"
DESCRIPTION = "The bundle provides a package that implements both author-year \
and numbered references, as well as much detailed of support \
for other bibliography use. Also Provided are versions of the \
standard BibTeX styles that are compatible with \
natbib--plainnat, unsrtnat, abbrnat. The bibliography styles \
produced by custom-bib are designed from the start to be \
compatible with natbib."
LICENSE = "LPPL-1.0"

PV = "2023.201.8.31bsvn20668"

RPM_NAME = "texlive-natbib-2023.201.8.31bsvn20668-54.1.noarch.rpm"
RPM_HASH = "98cfd4f30d3938cdff2b8d983b720fd7e3b8607eab4416ead879b888ee2eb25a063410d66b46708aa203e092c967f806deb2d0992c000a625093414c9a9137f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibentry.sty \
tex-natbib.sty \
texlive-natbib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-citeref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
