SUMMARY = "Introduction to LaTeX, in Chinese"
DESCRIPTION = "A Chinese edition of the not so short introduction to LaTeX2e, \
with additional information of typesetting Chinese language."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.6.03svn61100"

RPM_NAME = "texlive-lshort-chinese-2023.209.6.03svn61100-55.1.noarch.rpm"
RPM_HASH = "aa87c2500daaf27c36401f71bcb2b617400889d5262221e42c4f704bccaaa88833fada62d4a8a369244951e7a5070d6cf1175c1e9bd49940520ebc2f4c3ab060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-chinese"

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
