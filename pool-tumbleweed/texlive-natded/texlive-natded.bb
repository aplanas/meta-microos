SUMMARY = "Typeset natural deduction proofs"
DESCRIPTION = "The package provides commands to typeset proofs in the style \
used by Jaskowski, or that of Kalish and Montague."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn32693"

RPM_NAME = "texlive-natded-2023.209.0.0.1svn32693-55.1.noarch.rpm"
RPM_HASH = "0ed8ba43b7d1c80802affd7f06e97fe54b27c4634e6cc1f4f409fbc84b9cecdcdda9d9ea4c9a63547835ef84eba5193bce6874857e03fd13a5d7be135a3b7b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-natded.sty \
texlive-natded"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
