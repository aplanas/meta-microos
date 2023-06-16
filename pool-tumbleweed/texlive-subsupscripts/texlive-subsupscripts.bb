SUMMARY = "A range of sub- and superscript commands"
DESCRIPTION = "The package provides a comprehensive and flexible set of \
commands for combinations of left and right sub- and \
superscripts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn16080"

RPM_NAME = "texlive-subsupscripts-2023.201.1.0svn16080-57.1.noarch.rpm"
RPM_HASH = "86e6c463c68ef2bd8afa6f7462e85a7fac28b66f9e7b9e29910ff8be3417f6cf8c29c4b0266c3baeffbac4d548445db6d569c14774d9d0c2b912576aa4cfe1b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subsupscripts.sty \
texlive-subsupscripts"

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
