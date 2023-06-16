SUMMARY = "Utility programs for Polish users of TeX"
DESCRIPTION = "Provided as sources, not installed in the bin directories."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-gustprog-2023.201.svn54074-53.1.noarch.rpm"
RPM_HASH = "b7a72d7cd484a5fe2a42289f768571bc72d2c6c2dc7daddf0e7923f931d20f646b1226656a5ace76d9cf2789e1cde0f483f25062936857ff03470691130fcc6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gustprog"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/perl \
/usr/bin/sh \
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
