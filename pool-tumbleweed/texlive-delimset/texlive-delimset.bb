SUMMARY = "Typeset and declare sets of delimiters with convenient size control"
DESCRIPTION = "delimset is a LaTeX2e package to typeset and declare sets of \
delimiters in math mode whose size can be adjusted \
conveniently."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn49544"

RPM_NAME = "texlive-delimset-2023.209.1.1svn49544-53.1.noarch.rpm"
RPM_HASH = "edda8a47b66adeb388776eb00c81cfe5770f8f45c24690eca9c06917c985049126ea1b537eb21e3a774e7d58547a4f537dda47e2067cec457f0d4c021d3b2508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-delimset.sty \
texlive-delimset"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
