SUMMARY = "Allows \\caption at the beginning of a table-environment"
DESCRIPTION = "For several reasons a \\caption may be desirable at the top of a \
table environment. This package changes the table environment \
such that \\abovecaptionskip and \\belowcaptionskip are swapped. \
The package should also work with a non-standard table \
environment."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4svn17275"

RPM_NAME = "texlive-ftcap-2023.209.1.4svn17275-53.1.noarch.rpm"
RPM_HASH = "c67334825cf17f6a0c4f312a257c7f71b8051d22a6df9265c2cc7d9ab0dad32d8d4369e77ee425aaa1f94de7a7fc0e6abea812d3fde2701d3bd02635f9e35322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ftcap.sty \
texlive-ftcap"

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
