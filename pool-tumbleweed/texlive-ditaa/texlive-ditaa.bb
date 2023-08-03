SUMMARY = "Use ditaa diagrams within LaTeX documents"
DESCRIPTION = "With this package ditaa (DIagrams Through Ascii Art) diagrams \
can be embedded directly into LaTeX files."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn48932"

RPM_NAME = "texlive-ditaa-2023.209.0.0.9svn48932-53.1.noarch.rpm"
RPM_HASH = "994ed9f84823244145f1118c3e77ca5561a064f67d704fa65935ec9b02462efda9a992d33b443d1e928598e09bcb9caca1c249adbb5c0c1ad0f1dea41ea02a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ditaa.sty \
texlive-ditaa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyvrb.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
