SUMMARY = "Call latexdiff on two Git revisions of a file"
DESCRIPTION = "git-latexdiff is a tool to graphically visualize differences \
between different versions of a LaTeX file. Technically, it is \
a wrapper around git and latexdiff."
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.6.0svn54732"

RPM_NAME = "texlive-git-latexdiff-2023.209.1.6.0svn54732-53.1.noarch.rpm"
RPM_HASH = "c102e496234b85f22d9edb5ddcf427e9152f63fc8274d88f249585bd6de0ea32533b621daf548b13cbea1e09fcd58f72c4156fb14193354d6b1a0d73d2c57b03"
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
