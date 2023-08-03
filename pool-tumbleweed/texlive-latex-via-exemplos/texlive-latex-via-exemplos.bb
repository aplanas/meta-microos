SUMMARY = "A LaTeX course written in brazilian portuguese language"
DESCRIPTION = "This is a LaTeX2e course written in brazilian portuguese \
language."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.5.8svn63374"

RPM_NAME = "texlive-latex-via-exemplos-2023.209.0.0.5.8svn63374-56.1.noarch.rpm"
RPM_HASH = "b177c3ea56b4cc3f8bdca22ac1f3abbdac5f21be3b8b3d81720f9f86908c1896a8051db2adeb5897387395e75372df20d4e6de323c3e4687848eb86376831660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-via-exemplos"

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
