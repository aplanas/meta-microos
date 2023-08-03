SUMMARY = "Babel support for Spanish"
DESCRIPTION = "This bundle provides the means to typeset Spanish text, with \
the support provided by the LaTeX standard package babel. Note \
that separate support is provided for those who wish to typeset \
Spanish as written in Mexico."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.0qsvn59367"

RPM_NAME = "texlive-babel-spanish-2023.209.5.0qsvn59367-54.1.noarch.rpm"
RPM_HASH = "76f6f4c6d4c4482ebc416aa46ae754e2c7783fae817d03b0099ecafd33fb45f4574909337d7e0832f850648157af27e6d95abf74ee799c2d3cf22eb72893d646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romanidx.sty \
tex-spanish.ldf \
texlive-babel-spanish"

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
