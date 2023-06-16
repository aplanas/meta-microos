SUMMARY = "Include Functional MetaPost in LaTeX"
DESCRIPTION = "The fmp package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-fmp-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "4a1a69c1dbf8855eb6e6bae716fc6237d43f659bf7f8d42b634652671e1653dcbe81700d92e13bde41e74884150d3617681a8160472c791c0f5f8b03296221fc"
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
