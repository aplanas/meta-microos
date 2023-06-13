SUMMARY = "LaTeX support for the Duerer fonts"
DESCRIPTION = "LaTeX support for Hoenig's Computer Duerer fonts, using their \
standard fontname names."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-duerer-latex-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "22a59d03eb7e92781600a8678d9936323a4652bbeb8446afa9a566d3bfb81a7c4140d5bf500356c73dfc3354f1da08adc6fd625a0e8b70937e52c9fe5306322e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(duerer.sty) \
tex(ot1cdin.fd) \
tex(ot1cdr.fd) \
tex(ot1cdss.fd) \
tex(ot1cdtt.fd) \
texlive-duerer-latex"

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
