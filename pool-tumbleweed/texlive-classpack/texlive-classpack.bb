SUMMARY = "XML mastering for LaTeX classes and packages"
DESCRIPTION = "The package provides an experiment in using XML (specifically \
DocBook 5) to mark up and maintain LaTeX classes and packages. \
XSLT 2 styleheets generate the .dtx and .ins distribution files \
expected by end users."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.19svn55218"

RPM_NAME = "texlive-classpack-2023.201.1.19svn55218-53.1.noarch.rpm"
RPM_HASH = "03ee06bed0fcf73cab687d808db0f77a87d138180834d5f2499790090c4fa448e74399ea6acfbc6167bb3734668b6e49972ef7c2af86a33ddcd5dc7b1c677a98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-classpack.sty \
texlive-classpack"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-graphicx.sty \
tex-marginnote.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
