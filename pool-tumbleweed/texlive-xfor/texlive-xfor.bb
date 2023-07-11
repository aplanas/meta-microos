SUMMARY = "A reimplementation of the LaTeX for-loop macro"
DESCRIPTION = "The package redefines the LaTeX internal \\@for macro so that \
the loop may be prematurely terminated. The action is akin to \
the C/Java break statement, except that the loop does not \
terminate until the end of the current iteration"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05svn15878"

RPM_NAME = "texlive-xfor-2023.201.1.05svn15878-52.2.noarch.rpm"
RPM_HASH = "986f9ee5db1739d88c0bfaf516f784511b8735fd3055262d93767a3e08e0eb3494f34a9969526a9e36ee1216c2a9eab408f4d76886f8f795f1c501963c687b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xfor.sty \
texlive-xfor"

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
