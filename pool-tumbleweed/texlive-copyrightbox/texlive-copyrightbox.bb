SUMMARY = "Provide copyright notices for images in a document"
DESCRIPTION = "The package command \\copyrightbox[<placement>]{<image \
command>}{<text>}, which places the text as a copyright notice \
relating to the matter created by the image command."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.1svn24829"

RPM_NAME = "texlive-copyrightbox-2023.204.0.0.1svn24829-54.1.noarch.rpm"
RPM_HASH = "0571894ac94a5f75039cbac69dcf25b6fb434cf4dd8c00d363b98c4d4b16c5ce166e7b0331ca4025318c2a88d79fff25775d3bc38b44934d5ea756c6b23e7229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-copyrightbox.sty \
texlive-copyrightbox"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
