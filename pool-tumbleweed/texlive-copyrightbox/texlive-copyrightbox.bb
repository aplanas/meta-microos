SUMMARY = "Provide copyright notices for images in a document"
DESCRIPTION = "The package command \\copyrightbox[<placement>]{<image \
command>}{<text>}, which places the text as a copyright notice \
relating to the matter created by the image command."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn24829"

RPM_NAME = "texlive-copyrightbox-2023.209.0.0.1svn24829-55.1.noarch.rpm"
RPM_HASH = "7dda07f290a2cc34a5173807803729c8919498a06bd5594228361eb8caa370b76d7b92308f313d2773a5a9d329968d772620c10443c2798fbac370430acef514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-copyrightbox.sty \
texlive-copyrightbox"

RDEPENDS:${PN} += "/usr/bin/sh \
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
