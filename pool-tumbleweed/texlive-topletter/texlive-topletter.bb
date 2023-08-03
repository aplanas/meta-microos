SUMMARY = "Letter class for the Politecnico di Torino"
DESCRIPTION = "This package provides a LaTeX class for typesetting letters \
conforming to the official Corporate Image guidelines for the \
Politecnico di Torino. The class can be used for letters \
written in Italian and in English."
LICENSE = "Apache-1.0"

PV = "2023.209.0.0.3.0svn48182"

RPM_NAME = "texlive-topletter-2023.209.0.0.3.0svn48182-53.1.noarch.rpm"
RPM_HASH = "d6c84940aae351918c8b4c7b0ca3777fb624c12525cc33cd6d67f8bb18fbffffc0b33e592d5e40bcb38a9f473d201cb407f468cdf7ee20c06d4dd6eed6c61bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-TOPletter.cls \
texlive-topletter"

RDEPENDS:${PN} += "/usr/bin/sh \
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
