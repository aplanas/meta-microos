SUMMARY = "Intelligent brackets"
DESCRIPTION = "This small package provides a new definition of brackets [ and \
] as active characters to get correct blank spaces in \
mathematical mode when using for open intervals. Instead of \
parenthesis: ]-\\infty, 0[ is equivalent to (-\\infty, 0)."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn65383"

RPM_NAME = "texlive-ibrackets-2023.208.1.1svn65383-53.1.noarch.rpm"
RPM_HASH = "d30c0564f14e09f3566433b4e30f0d77d463054649f49c0015a7e23b042c9466ff14482d38634174c5d9cde78007f2b5c201d8865d2f3301506d0b004056f5dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ibrackets.sty \
texlive-ibrackets"

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
