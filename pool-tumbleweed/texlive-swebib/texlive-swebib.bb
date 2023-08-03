SUMMARY = "Swedish bibliography styles"
DESCRIPTION = "The bundle contains Swedish versions of the standard \
bibliography styles, and of the style plainnat. The styles \
should be funtionally equivalent to the corresponding original \
styles, apart from the Swedish translations. The styles do not \
implement Swedish collation."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-swebib-2023.209.svn15878-58.1.noarch.rpm"
RPM_HASH = "d54eb16b3113bc6da4441b414bfe10e02e2631d1e7ada1836a071dc139a1c9bc7a3a1549d570b6e944d6fa1686a5ccf63aaa30697c3ebd543f58adbafebcc126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swebib"

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
