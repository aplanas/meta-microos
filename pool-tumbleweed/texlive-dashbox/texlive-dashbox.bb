SUMMARY = "Draw dashed boxes"
DESCRIPTION = "The package can draw boxes that perform like \\framebox or \
\\fbox, but use dashed lines. The package can also draw (an \
illusion of) vertical stacks of boxes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.14svn23425"

RPM_NAME = "texlive-dashbox-2023.209.1.14svn23425-55.1.noarch.rpm"
RPM_HASH = "47a6848b3e0898a33ffae1f21cbce876136eba10057ca4f97f98eec40eacde96723a34af5aba364b7deea6abf0f691639b4190bd6d9ad8aaecce8764488720e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dashbox.sty \
texlive-dashbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
