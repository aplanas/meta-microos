SUMMARY = "Easy creation of 'arithmetical restoration' puzzles"
DESCRIPTION = "This package permits to easily typeset arithmetical \
restorations using LaTeX. This package requires the graphicx \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn47472"

RPM_NAME = "texlive-musikui-2023.201.1svn47472-54.1.noarch.rpm"
RPM_HASH = "15598cb7aa3a21d65632bf73451770a9b3be57084dafad91569e21450e20dee58f4c6460c95237bae1f604f6b9a80f0d4c3e44cb62bdc547012eb022d7fbbb23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musikui.sty \
texlive-musikui"

RDEPENDS:${PN} += "/bin/sh \
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
