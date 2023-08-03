SUMMARY = "Declare global variables"
DESCRIPTION = "This package allows the user to declare a variable which can \
then be used anywhere else in a document, including before it \
was declared."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn49962"

RPM_NAME = "texlive-globalvals-2023.209.1.1svn49962-54.1.noarch.rpm"
RPM_HASH = "1af445d874ba779ff166490053ed84a4073d2c5e7466ad48ae99d953fcccdbd97252cf0c8a1628185295064ac2dddca2da42ad463b3aed0a6b6ec2e7cd59d6d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-globalvals.sty \
texlive-globalvals"

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
