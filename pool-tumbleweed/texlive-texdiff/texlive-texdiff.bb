SUMMARY = "Compare documents and produce tagged merge"
DESCRIPTION = "Two files are compared and a new TeX file is output. When the \
output file is processed with (La)TeX it marks new changes with \
blue and old text with red with a strike-through line. \
Furthermore, passages with changes are marked at the margin \
with grey bars by the LaTeX changebar package."
LICENSE = "Artistic-1.0"

PV = "2023.201.0.0.4svn29752"

RPM_NAME = "texlive-texdiff-2023.201.0.0.4svn29752-54.1.noarch.rpm"
RPM_HASH = "cd010d68888d2934abdb378362808e120c050537ea955df38f423e774a08b58045e5e7c2a102b98d6c1ba979894010835f7a4a324f1f413631e8fee6c3d541f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdiff"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-Pod--Usage \
perl-re \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texdiff-bin"

inherit rpm
