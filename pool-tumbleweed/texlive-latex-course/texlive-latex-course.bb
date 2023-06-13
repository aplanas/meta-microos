SUMMARY = "A LaTeX course as a projected presentation"
DESCRIPTION = "A brief Beamer-based slide presentation on LaTeX, based on \
Rupprecht's LaTeX 2.09 course, which the author has translated \
to English and taken to LaTeX2e/Beamer. Additional material was \
taken from the Short Introduction to LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2svn25505"

RPM_NAME = "texlive-latex-course-2023.201.2svn25505-55.1.noarch.rpm"
RPM_HASH = "94fb0f25e5aa0ba7edfa0f1a78698ef320ca29c516cc26a46dc647c619a0f5fc8a57c5c0d63227a88ca3af7b61fc67178e3c255429628fa6cac8078a27c22380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-course"

RDEPENDS:${PN} += "/bin/sh \
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
