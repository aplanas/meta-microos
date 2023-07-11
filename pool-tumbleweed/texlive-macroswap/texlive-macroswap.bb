SUMMARY = "Swap the definitions of two LaTeX macros"
DESCRIPTION = "The package provides simple utility methods to swap the meaning \
(token expansion) of two macros by name."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn31498"

RPM_NAME = "texlive-macroswap-2023.208.1.1svn31498-53.1.noarch.rpm"
RPM_HASH = "3df2e45a82414409c2a4345d440d51c2950f2758d6323351e5f6a5b93845b698f5f33b43e6e47fb5d4a976e9e22187b1f3182e17136ce926c18d3f0a1b0c545d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-macroswap.sty \
texlive-macroswap"

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
