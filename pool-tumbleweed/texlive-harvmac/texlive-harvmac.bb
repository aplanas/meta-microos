SUMMARY = "Macros for scientific articles"
DESCRIPTION = "Known as 'Harvard macros', since written at that University."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-harvmac-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "5f6de5b9cc058a5acfaa75c5e4fc72db87aa7c2bb948b88f846088cb8e76e30709c0b88257310c3aaee065f2a14122b392e14ab5c2145af80e6629041ec997ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harvmac.tex \
texlive-harvmac"

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
