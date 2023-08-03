SUMMARY = "Vietnamese translation of AMSLaTeX documentation"
DESCRIPTION = "This is a Vietnamese translation of amsldoc, the users' guide \
to amsmath."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn21855"

RPM_NAME = "texlive-amsldoc-vn-2023.209.2.0svn21855-55.1.noarch.rpm"
RPM_HASH = "da3394da0e2405d03e76af6ba0662275f76a005c90cd32b8b70700ab40e9432d373e3fc43b18f7e5c93de824e470f779eadffb6f1f108f329794d09f02333258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsldoc-vn"

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
