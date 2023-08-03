SUMMARY = "Environments and options for typesetting university assignments"
DESCRIPTION = "The purpose of this package is to provide simple question and \
solution style environments for typesetting university \
assignments."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn38459"

RPM_NAME = "texlive-uassign-2023.209.1.01svn38459-53.1.noarch.rpm"
RPM_HASH = "c962de9775e7f288b52125da91a64c7743893b22e0488391a16abc8f965ac1f69f22c05b5dbfe03762d2779e67e602a56d47b9a5405ad0ffb325cd734696c8ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uassign.sty \
texlive-uassign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amsthm.sty \
tex-bookmark.sty \
tex-color.sty \
tex-enumerate.sty \
tex-fancyhdr.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
