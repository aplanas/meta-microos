SUMMARY = "Introduction to LaTeX in Italian"
DESCRIPTION = "This is the Italian translation of the Short Introduction to \
LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.6.2svn57038"

RPM_NAME = "texlive-lshort-italian-2023.209.6.2svn57038-55.1.noarch.rpm"
RPM_HASH = "cab075049bcb2a4674ee35ba6a665896a97629aef3a27ce2db9e452916601477ddff4d9324ba0512aae86bb9f367921eeade0c586659457b255fb8cc5c38dfb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-italian"

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
