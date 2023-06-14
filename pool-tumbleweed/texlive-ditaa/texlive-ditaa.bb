SUMMARY = "Use ditaa diagrams within LaTeX documents"
DESCRIPTION = "With this package ditaa (DIagrams Through Ascii Art) diagrams \
can be embedded directly into LaTeX files."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn48932"

RPM_NAME = "texlive-ditaa-2023.201.0.0.9svn48932-52.1.noarch.rpm"
RPM_HASH = "8fad428b0eadc0dedde4d887e5c94944ac29f60561ba882089d7c352e8915ecc0ffadc81a0231d83be3df4c445dee31f014e57525e56cf0912fc69d5463e5ff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ditaa.sty \
texlive-ditaa"

RDEPENDS:${PN} += "/bin/sh \
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
