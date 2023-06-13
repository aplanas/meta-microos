SUMMARY = "Unofficial letterhead template for the University of Amsterdam"
DESCRIPTION = "This is an unofficial LaTeX package that provides a letterhead \
template for the University of Amsterdam. The design mimics the \
official Word template of the University and complies with the \
University's house style."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn66330"

RPM_NAME = "texlive-uvaletter-2023.201.1.1.0svn66330-53.1.noarch.rpm"
RPM_HASH = "8ad7a1928a0b95ec8fc382026eb56f20aecdfbd60c9b9b2aa436c86f84867292ce852eb05ca0fd28bac303ff4eafc6fbc939499ee46bb953340c56467c9acde4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uvaletter.sty) \
texlive-uvaletter"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fancyhdr.sty) \
tex(fontenc.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(ifthen.sty) \
tex(inputenc.sty) \
tex(lastpage.sty) \
tex(microtype.sty) \
tex(setspace.sty) \
tex(soul.sty) \
tex(times.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
