SUMMARY = "XML mastering for LaTeX classes and packages"
DESCRIPTION = "The package provides an experiment in using XML (specifically \
DocBook 5) to mark up and maintain LaTeX classes and packages. \
XSLT 2 styleheets generate the .dtx and .ins distribution files \
expected by end users."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.19svn55218"

RPM_NAME = "texlive-classpack-2023.209.1.19svn55218-54.1.noarch.rpm"
RPM_HASH = "b172724c962b2042d036c8e2583d208f789cecb4bb8fc3a9ed4f2166065f2202fed925bd95b5909425db3aa6c98b6b8dd21896f07575e7c27d3f95bbf5d6a186"
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
