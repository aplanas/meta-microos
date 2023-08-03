SUMMARY = "Macro tools by Mike Piff"
DESCRIPTION = "The set (now) consists of: a small package for dealing with \
duplicate-numbered output pages; newproof, for defining \
mathematical proof structures; onepagem for omitting the page \
number in one-page documents and time, which prints a 12-hour \
format time."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn21894"

RPM_NAME = "texlive-piff-2023.209.svn21894-52.1.noarch.rpm"
RPM_HASH = "608fe20f2ee3a093e4ac7d949f99d47339dbab2423fd54f22f3c818908132894595a29475c72a7965062532903d9ecbdadc14029d1d59afd451ea7f8ae3cb8ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-duplicat.sty \
tex-newproof.sty \
tex-onepagem.sty \
tex-time.sty \
texlive-piff"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
