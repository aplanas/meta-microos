SUMMARY = "A reimplementation of the LaTeX for-loop macro"
DESCRIPTION = "The package redefines the LaTeX internal \\@for macro so that \
the loop may be prematurely terminated. The action is akin to \
the C/Java break statement, except that the loop does not \
terminate until the end of the current iteration"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn15878"

RPM_NAME = "texlive-xfor-2023.209.1.05svn15878-53.1.noarch.rpm"
RPM_HASH = "4b0e1c3b78823afdfa4b695cb70da76161aba0b282411af5feada00c83d7fa03d93d5698ad9ec557b579858e5ef92edca37e47a84548ddbe498aef3601f3c320"
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
