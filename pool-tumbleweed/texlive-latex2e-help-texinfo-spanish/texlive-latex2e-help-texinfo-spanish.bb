SUMMARY = "Unofficial reference manual covering LaTeX2e"
DESCRIPTION = "The manual is provided as Texinfo source (which was originally \
derived from the VMS help file in the DECUS TeX distribution of \
1990, with many subsequent changes). This is a collaborative \
development, and details of getting involved are to be found on \
the package home page. A French translation is available as a \
separate package. All the other formats in the distribution are \
derived from the Texinfo source, as usual."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65614"

RPM_NAME = "texlive-latex2e-help-texinfo-spanish-2023.209.svn65614-55.1.noarch.rpm"
RPM_HASH = "271f0a3aee6dc8f11b28c86603181d9ab657dcf651f866654a6d3250e7334384ddddc1e0ecdf980e762f42a159dfb2c3037b9ccf188b8fa453bbb5a0c3cdcd02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex2e-help-texinfo-spanish"

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
