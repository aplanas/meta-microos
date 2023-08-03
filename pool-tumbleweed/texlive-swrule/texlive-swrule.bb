SUMMARY = "Lines thicker in the middle than at the ends"
DESCRIPTION = "Defines commands that create rules split into a (specified) \
number of pieces, whose size varies to produce the effect of a \
rule that swells in its centre."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54267"

RPM_NAME = "texlive-swrule-2023.209.svn54267-58.1.noarch.rpm"
RPM_HASH = "a0b936c580479bd6f3f6e0c7584532d46a430f6a82ce58b9edbca90e844128c3d59b7352315fc95b8d4c7aa05cfb60a970b6c60d53f7dc4fc9cd444baa59bcd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-swrule.sty \
texlive-swrule"

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
