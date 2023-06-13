SUMMARY = "A reimplementation of the LaTeX for-loop macro"
DESCRIPTION = "The package redefines the LaTeX internal \\@for macro so that \
the loop may be prematurely terminated. The action is akin to \
the C/Java break statement, except that the loop does not \
terminate until the end of the current iteration"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05svn15878"

RPM_NAME = "texlive-xfor-2023.201.1.05svn15878-52.1.noarch.rpm"
RPM_HASH = "0b599d39612256ccc3c98cfed17246b001972b003a08d0f338f50efa29f41ec576475fe33283e729c987db43e94a262acdafee5e05512f88d319abae3aadb34f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xfor.sty) \
texlive-xfor"

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
