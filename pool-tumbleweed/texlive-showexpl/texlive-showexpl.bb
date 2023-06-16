SUMMARY = "Typesetting LaTeX source code"
DESCRIPTION = "This package provides a way to typeset LaTeX source code and \
the related result in the same document."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3ssvn57414"

RPM_NAME = "texlive-showexpl-2023.201.0.0.3ssvn57414-53.1.noarch.rpm"
RPM_HASH = "686b033485b9c26b00a647696c7f4c173f10d0b75563710e1e4e54f4ac1940a4bef8335e14da07d7406d6770b3cb159afe024e9649ec4b6eb84be8a67ab37ee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showexpl.sty \
texlive-showexpl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-graphicx.sty \
tex-listings.sty \
tex-refcount.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
