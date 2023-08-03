SUMMARY = "Development pre-release of the LaTeX amsmath bundle"
DESCRIPTION = "This is a pre-release version of the standard LaTeX amsmath \
bundle. It accompanies the pre-testing kernel code \
(latex-base-dev), and is intended for testing by knowledgeable \
users."
LICENSE = "LPPL-1.0"

PV = "2023.209.20230501_pre_release_0svn64899"

RPM_NAME = "texlive-latex-amsmath-dev-2023.209.20230501_pre_release_0svn64899-56.1.noarch.rpm"
RPM_HASH = "e992182617b135b5bd5a649032483beea13bf531b313ed0ad25f43ce973ff5bed1d697ecd02971c156ca5c6d804e841e78c87d9d9ab6e5cb63edaf2e6626cefa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev-amsbsy.sty \
texdev-amscd.sty \
texdev-amsgen.sty \
texdev-amsmath-2018-12-01.sty \
texdev-amsmath.sty \
texdev-amsopn.sty \
texdev-amstex.sty \
texdev-amstext.sty \
texdev-amsxtra.sty \
texlive-latex-amsmath-dev"

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
