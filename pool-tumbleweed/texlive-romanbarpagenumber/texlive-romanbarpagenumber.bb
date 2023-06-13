SUMMARY = "Typesetting roman page numbers"
DESCRIPTION = "The package romanbar allows to typeset roman numbers with bars. \
This package allows you to use those roman numbers as page \
number."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36236"

RPM_NAME = "texlive-romanbarpagenumber-2023.201.1.0svn36236-53.1.noarch.rpm"
RPM_HASH = "a16d3824f5a39cc0cde3a9cf78020858ebe3389bee1c1a9bb8bfb961b6e12ec9fe194069e9bcd09fda812c3b9f30aacd3ddca17fe6b06237d069857202a816b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(romanbarpagenumber.sty) \
texlive-romanbarpagenumber"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvoptions.sty) \
tex(romanbar.sty) \
tex(xifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
