SUMMARY = "Document class and bibliography style for Lecture Notes in Computer Science (LNCS)"
DESCRIPTION = "This is Springer's official macro package for typesetting \
contributions to be published in Springer's Lecture Notes in \
Computer Science (LNCS) and its related proceedings series \
CCIS, LNBIP, LNICST, and IFIP AICT."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.22svn64299"

RPM_NAME = "texlive-llncs-2023.209.2.22svn64299-55.1.noarch.rpm"
RPM_HASH = "c792318ffcaaaf29c22874f0de3e59c17779a7b003d62203a8f0cdfac8157da8b38742a71b0071368bb4107632f2963405c0a45a801d04a700643a7e67b61908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-llncs.cls \
texlive-llncs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-aliascnt.sty \
tex-article.cls \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
