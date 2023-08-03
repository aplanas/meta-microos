SUMMARY = "Tools to produce formats that read Polish language input"
DESCRIPTION = "The bundle provides files for building formats to read input in \
Polish encodings."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-utf8mex-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "797fadf9ad630fa47c293916c96c9954366f525c388beade6f0137bf91a8a9ef37c1e7a5300316992ae7a87da324eff6b1f7d0572dc2be6e95edb57a2fc98039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-utf8-pl.tex \
tex-utf8plsq.tex \
texlive-utf8mex"

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
