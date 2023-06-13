SUMMARY = "Various layout styles for school documents"
DESCRIPTION = "The purpose of this package is to provide several layout styles \
for school documents. It is useful for exercise sheets, exams, \
course materials. The package sets the page geometry \
(dimensions of text and margins) and the title typesetting; the \
various styles define the header, footer and title formatting. \
Many features are freely configurable."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65650"

RPM_NAME = "texlive-schooldocs-2023.201.1.2svn65650-53.1.noarch.rpm"
RPM_HASH = "f47bd234ffa8907551afa1968d9038493c65d99287b1de281cff8a6be65c876f56d84ca0f1a53e1f990cf6b12e914273562135e7458fa2b36c16e26fc8e07752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(schooldocs.sty) \
texlive-schooldocs"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fancybox.sty) \
tex(fancyhdr.sty) \
tex(geometry.sty) \
tex(ifthen.sty) \
tex(lastpage.sty) \
tex(translations.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
