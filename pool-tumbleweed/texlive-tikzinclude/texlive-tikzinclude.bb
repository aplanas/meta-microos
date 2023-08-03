SUMMARY = "Import TikZ images from colletions"
DESCRIPTION = "The package addresses the problem of importing only one \
TikZ-image from a file holding multiple images."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn28715"

RPM_NAME = "texlive-tikzinclude-2023.209.1.0svn28715-53.1.noarch.rpm"
RPM_HASH = "19e0c064efd98297d3e66d6bd149edef2734fe17719959e294690cfa8bc7688db11d053f50fc593e2f87356a3c2d5ff7f121bbe70b62991aa8d28a51d6c02456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzinclude.sty \
texlive-tikzinclude"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
