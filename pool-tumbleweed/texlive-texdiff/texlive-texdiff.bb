SUMMARY = "Compare documents and produce tagged merge"
DESCRIPTION = "Two files are compared and a new TeX file is output. When the \
output file is processed with (La)TeX it marks new changes with \
blue and old text with red with a strike-through line. \
Furthermore, passages with changes are marked at the margin \
with grey bars by the LaTeX changebar package."
LICENSE = "Artistic-1.0"

PV = "2023.209.0.0.4svn29752"

RPM_NAME = "texlive-texdiff-2023.209.0.0.4svn29752-55.1.noarch.rpm"
RPM_HASH = "2a8c9b045ebe7ff8de262714915e0697342c2cc1662afe6fa097e29257535c2680975107cc36347a7d4c5c7ac36612ad025b2737e54ed5f1d24785d4fbd6873f"
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
