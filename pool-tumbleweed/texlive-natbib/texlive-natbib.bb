SUMMARY = "Flexible bibliography support"
DESCRIPTION = "The bundle provides a package that implements both author-year \
and numbered references, as well as much detailed of support \
for other bibliography use. Also Provided are versions of the \
standard BibTeX styles that are compatible with \
natbib--plainnat, unsrtnat, abbrnat. The bibliography styles \
produced by custom-bib are designed from the start to be \
compatible with natbib."
LICENSE = "LPPL-1.0"

PV = "2023.209.8.31bsvn20668"

RPM_NAME = "texlive-natbib-2023.209.8.31bsvn20668-55.1.noarch.rpm"
RPM_HASH = "c213c5e04c4dd86d8a05bdbfad9883a58b037b48f30cf4dbb52f8d8b44330a809e384ba379a201f0d4a638cc7e0ee30f7e669800ef9cac5a32f7ff99cb579193"
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
