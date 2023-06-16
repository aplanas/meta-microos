SUMMARY = "Typesetting Z and CSP format specifications"
DESCRIPTION = "The package supports real-time CSP and incorporates the \
functionality of Spivey's original Z package, written for LaTeX \
2.09."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17258"

RPM_NAME = "texlive-zed-csp-2023.201.svn17258-52.1.noarch.rpm"
RPM_HASH = "b0998c22278f23c20d494e092b73a619bc363e29ec83dbc1d8fad280645a367745bbeab0d481209d613bbd004cb6ce197616a83a1aa5fadead4446939e5676b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zed-csp.sty \
texlive-zed-csp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
