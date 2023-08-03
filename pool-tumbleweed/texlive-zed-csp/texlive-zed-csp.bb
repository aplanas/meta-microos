SUMMARY = "Typesetting Z and CSP format specifications"
DESCRIPTION = "The package supports real-time CSP and incorporates the \
functionality of Spivey's original Z package, written for LaTeX \
2.09."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17258"

RPM_NAME = "texlive-zed-csp-2023.209.svn17258-53.1.noarch.rpm"
RPM_HASH = "6c754ce9f00cd3916ab24f342445adde75f26b30b5c511938197c2aef1a4b4a4829cb886db525a9d56a35b0518f403da89b63036acf314da2bd9102002bd01bc"
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
