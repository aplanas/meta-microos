SUMMARY = "Simple gradient frames around objects"
DESCRIPTION = "The package provides a means of drawing graded frames around \
objects. The gradients of the frames are drawn using the color \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn21387"

RPM_NAME = "texlive-gradientframe-2023.209.0.0.2svn21387-54.1.noarch.rpm"
RPM_HASH = "4a9d71588f8e97c84ac64cb01dc3300e6ddb2d5196d50d98330b041476fefe30a398186b88c46986535b98cea5d61892de8b2892bf2ea8ceff805b8440389d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gradientframe.sty \
texlive-gradientframe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
