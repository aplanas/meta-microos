SUMMARY = "A Simplified Introduction to LaTeX"
DESCRIPTION = "An accessible introduction for the beginner."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20620"

RPM_NAME = "texlive-simplified-latex-2023.201.svn20620-57.1.noarch.rpm"
RPM_HASH = "ac03fb544d75e39ef9d0c302b93852f6a5f4d6b4de9cbdf30a8d7f2bf392685a8ee2fe4af1904046c9a36d8cad9cf8702e52cd58804105b53f790dec70d9ca56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplified-latex"

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
