SUMMARY = "Let assignment for LaTeX macros"
DESCRIPTION = "TeX's \\let assignment does not work for LaTeX macros with \
optional arguments or for macros that are defined as robust \
macros by \\DeclareRobustCommand. This package defines \
\\LetLtxMacro that also takes care of the involved internal \
macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn53022"

RPM_NAME = "texlive-letltxmacro-2023.201.1.6svn53022-54.1.noarch.rpm"
RPM_HASH = "0929d3adfc455252d0de232ec807cb5174f1f554a1b0ef3211881f86b1586250ced2a1e85466c0e5c1cd7fd2dc49fa85d792527ed6b0a8c1b1f04114c5ef643c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(letltxmacro.sty) \
texlive-letltxmacro"

RDEPENDS:${PN} += "/bin/sh \
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
