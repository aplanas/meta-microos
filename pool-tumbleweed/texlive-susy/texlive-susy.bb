SUMMARY = "Macros for SuperSymmetry-related work"
DESCRIPTION = "The package provides abbreviations of longer expressions."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19440"

RPM_NAME = "texlive-susy-2023.201.svn19440-57.1.noarch.rpm"
RPM_HASH = "7c461638a8bfc6fa1e1f740fec95f075df60eb2c6f04035fddfb4670f41b964f6075195171ecef80f5ab40508783c65a9ae2ef4d898b598ac2394bfdd5411e4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(susy.sty) \
texlive-susy"

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
