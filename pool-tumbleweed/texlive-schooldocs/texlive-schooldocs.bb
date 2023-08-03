SUMMARY = "Various layout styles for school documents"
DESCRIPTION = "The purpose of this package is to provide several layout styles \
for school documents. It is useful for exercise sheets, exams, \
course materials. The package sets the page geometry \
(dimensions of text and margins) and the title typesetting; the \
various styles define the header, footer and title formatting. \
Many features are freely configurable."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn65650"

RPM_NAME = "texlive-schooldocs-2023.209.1.2svn65650-54.1.noarch.rpm"
RPM_HASH = "4ae4e80add83b2bb227abc0abf6dbeec07c893adc1f3ee888659abec0260262828cc34b848e6877b5ae4656cf49af3f48042a648f13463e9c865fe92b5a25494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schooldocs.sty \
texlive-schooldocs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancybox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-lastpage.sty \
tex-translations.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
