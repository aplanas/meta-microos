SUMMARY = "A LaTeX course as a projected presentation"
DESCRIPTION = "A brief Beamer-based slide presentation on LaTeX, based on \
Rupprecht's LaTeX 2.09 course, which the author has translated \
to English and taken to LaTeX2e/Beamer. Additional material was \
taken from the Short Introduction to LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2svn25505"

RPM_NAME = "texlive-latex-course-2023.209.2svn25505-56.1.noarch.rpm"
RPM_HASH = "3c1dcbfcf72e29472480aec2826f70432428ecc18b7bfad3a83ee47549c1bff010a1f772fc2ecaf8e32f994ceb334cc2d802cfa08a9f54fa5551864fffc2716e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-course"

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
