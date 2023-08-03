SUMMARY = "Easy creation of 'arithmetical restoration' puzzles"
DESCRIPTION = "This package permits to easily typeset arithmetical \
restorations using LaTeX. This package requires the graphicx \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn47472"

RPM_NAME = "texlive-musikui-2023.209.1svn47472-55.1.noarch.rpm"
RPM_HASH = "3f6fbce87cd5d5c8742c2a89e31d72f633c05a3994b798e5bb3192bb668ec4f73b7a5dad66ace4c31491c0dfd86c50ed24c2f1232c1bda10cf9c828786134eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musikui.sty \
texlive-musikui"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
