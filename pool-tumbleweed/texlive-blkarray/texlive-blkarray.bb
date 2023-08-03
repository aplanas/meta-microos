SUMMARY = "Extended array and tabular"
DESCRIPTION = "An experimental package which implements an environment, \
blockarray, that may be used in the same way as the array or \
tabular environments of standard LaTeX, or their extended \
versions defined in array. If used in math-mode, blockarray \
acts like array, otherwise it acts like tabular. The package \
implements a new method of defining column types, and also \
block and block* environments, for specifying sub-arrays of the \
main array. What's more, the \\footnote command works inside a \
blockarray."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.07svn36406"

RPM_NAME = "texlive-blkarray-2023.209.0.0.07svn36406-53.1.noarch.rpm"
RPM_HASH = "a3b338eabb9301fb0aa616017c7ffbd59bc9e9cfbbe826ea7534f91a72cca648c4285fbc945a50294ad12409072981d25557b478d454e1a31b10ed803604c039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blkarray.sty \
texlive-blkarray"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.sty \
tex-doc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
