SUMMARY = "Unofficial reference manual covering LaTeX2e"
DESCRIPTION = "The manual is provided as Texinfo source (which was originally \
derived from the VMS help file in the DECUS TeX distribution of \
1990, with many subsequent changes). This is a collaborative \
development, and details of getting involved are to be found on \
the package home page. A French translation is available as a \
separate package. All the other formats in the distribution are \
derived from the Texinfo source, as usual."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65552"

RPM_NAME = "texlive-latex2e-help-texinfo-2023.201.svn65552-54.1.noarch.rpm"
RPM_HASH = "70f476579e9594cff25d118b05552e9fc833eaf43c46296c662161c259453ac32c51df9e1940fb5999c9aef0f2ded4f4a840c839fbd6b0d5eceaacfbadc00814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex2e-help-texinfo"
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
