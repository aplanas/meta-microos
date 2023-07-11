SUMMARY = "Fix various layout issues in math mode"
DESCRIPTION = "This is a LaTeX2e package to fix some odd behaviour in math \
mode such as spacing around fractions and roots, math symbols \
within bold text as well as capital Greek letters. It also adds \
some related macros."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.01svn49547"

RPM_NAME = "texlive-mathfixs-2023.208.1.01svn49547-53.1.noarch.rpm"
RPM_HASH = "7b4eb49bba7a336a7444092e49d8a4b3e1126b23d25809c3c62ade31473b129906db4df80b7c23e8bb8e40f7847dd06f158baee9d6410e541d160cbd4541a20b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathfixs.sty \
texlive-mathfixs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
