SUMMARY = "Unofficial reference manual covering LaTeX2e"
DESCRIPTION = "The manual is provided as Texinfo source (which was originally \
derived from the VMS help file in the DECUS TeX distribution of \
1990, with many subsequent changes). This is a collaborative \
development, and details of getting involved are to be found on \
the package home page. A French translation is available as a \
separate package. All the other formats in the distribution are \
derived from the Texinfo source, as usual."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65552"

RPM_NAME = "texlive-latex2e-help-texinfo-2023.209.svn65552-55.1.noarch.rpm"
RPM_HASH = "650f7efcca80696632fdc1d97d08088c9106ff409c6ade3b31174b767697c434253d3cbf4a2313237e8030dfd969167cb774df98bd7ef17e56eea579c07f08a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex2e-help-texinfo"

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
