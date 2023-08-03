SUMMARY = "Chinese Introduction to TeX and LaTeX"
DESCRIPTION = "The document is an introduction to TeX/LaTeX, in Chinese. It \
covers basic text typesetting, mathematics, graphics, tables, \
Chinese language & fonts, and some miscellaneous features \
(hyperlinks, long documents, bibliographies, indexes and page \
layout)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn15878"

RPM_NAME = "texlive-latex-notes-zh-cn-2023.209.1.20svn15878-56.1.noarch.rpm"
RPM_HASH = "4032af7669c5a904829d8c7e0e1c7c4b1931f2f5f0e50eea882b7dfe5c2cbef32575402b339140db0769b56b5d56c7115080cd211aa662c8dae66cc807c789aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-notes-zh-cn"

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
