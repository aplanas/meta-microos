SUMMARY = "Short introduction to LaTeX, French translation"
DESCRIPTION = "French version of A Short Introduction to LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.5.01fr_0svn23332"

RPM_NAME = "texlive-lshort-french-2023.209.5.01fr_0svn23332-55.1.noarch.rpm"
RPM_HASH = "294f186768f39ac7073ca2c3dd94a4f6e2994fcb38c4cf50d2f43256cd467e573dfbd94843629980bd4debe418bdffab8fb8e229d023682b78a9b021cf9e0d8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-french"

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
