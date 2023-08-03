SUMMARY = "Include Functional MetaPost in LaTeX"
DESCRIPTION = "The fmp package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-fmp-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "af398982afb8891ead375b7b2a7fabc8f861bc213e6df1bd521ec05499e8f9862396f61a41e9495c7df92419a74628f65aaf21c574ca89f88cd3956f9df1ef9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fmp.sty \
texlive-fmp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
