SUMMARY = "Show ConTeXt layouts"
DESCRIPTION = "Draws a representation of the layout of the current page and \
displays the sizes of the widths and heights of the margins, \
header, footer and text body."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-layout-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "5361d45b78c9b9d4f45f6f6f90beb6b99adb3286496701cfc91dc006029a124dd2e170f0e1ed010b97b6f0d2f56f0a30b5cf1fe3f1bf083b98a5c618842a9d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-layout.tex \
texlive-context-layout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
