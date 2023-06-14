SUMMARY = "Letter class for the Politecnico di Torino"
DESCRIPTION = "This package provides a LaTeX class for typesetting letters \
conforming to the official Corporate Image guidelines for the \
Politecnico di Torino. The class can be used for letters \
written in Italian and in English."
LICENSE = "Apache-1.0"

PV = "2023.201.0.0.3.0svn48182"

RPM_NAME = "texlive-topletter-2023.201.0.0.3.0svn48182-52.1.noarch.rpm"
RPM_HASH = "47b953eca924b2263900f433bdaeeb17db88e336af895f876f2a5da3253e021266e8dc6ea09cfd631ddfb4a74e5c7a435faec534e5a7bb27864b14281e65baeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-TOPletter.cls \
texlive-topletter"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-changepage.sty \
tex-color.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-iflang.sty \
tex-inputenc.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
