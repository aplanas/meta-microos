SUMMARY = "Short introduction to LaTeX, in Mongolian"
DESCRIPTION = "A translation of Oetiker's Not so short introduction."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.26svn15878"

RPM_NAME = "texlive-lshort-mongol-2023.209.4.26svn15878-55.1.noarch.rpm"
RPM_HASH = "083428e16ab50fe5bcb0d8a9c840a72d62f5e37f0c4451539dcb540ff7035b8fb853504bb490b43e4ff1273465f093b5fdc2bc1c2011b671359cce5077b564d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-mongol"

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
