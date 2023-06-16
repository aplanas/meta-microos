SUMMARY = "Call latexdiff on two Git revisions of a file"
DESCRIPTION = "git-latexdiff is a tool to graphically visualize differences \
between different versions of a LaTeX file. Technically, it is \
a wrapper around git and latexdiff."
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.6.0svn54732"

RPM_NAME = "texlive-git-latexdiff-2023.201.1.6.0svn54732-52.1.noarch.rpm"
RPM_HASH = "167569e6f0749093da6c9ff78a77f019093e11e1545c49cc0cbda6d7e0a59b8000b41d6c25608c86a61a811f6e66635c6817d80ddd9f4847aa600645cc0ccfdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-git-latexdiff"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-git-latexdiff-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
