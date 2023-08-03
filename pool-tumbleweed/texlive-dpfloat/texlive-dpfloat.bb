SUMMARY = "Support for double-page floats"
DESCRIPTION = "Provides fullpage and leftfullpage environments, that may be \
used inside a figure, table, or other float environment. If the \
first of a 2-page spread uses a 'leftfullpage' environment, the \
float will only be typeset on an even-numbered page, and the \
two floats will appear side-by-side in a two-sided document."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17196"

RPM_NAME = "texlive-dpfloat-2023.209.svn17196-53.1.noarch.rpm"
RPM_HASH = "e43fef27bfc0923ad6dfab56f1f70037c722123f775094651b225485faefede98486e658d2aeeca8f758ce7e1b5a678b2512578d1f87de95d7f2a0ab64a9eaa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dpfloat.sty \
texlive-dpfloat"

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
