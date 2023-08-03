SUMMARY = "Macros for building proof trees"
DESCRIPTION = "A package to typeset proof trees for natural deduction calculi, \
sequent-like calculi, and similar."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.6svn54080"

RPM_NAME = "texlive-prftree-2023.209.1.6svn54080-53.1.noarch.rpm"
RPM_HASH = "476361265a403d5d7134a0877d605c5ac5ee244075853d62ef692db83cba4ab368c5843583ac14fdc88247488d08d38b6ed1fa5b4d8cd4c56d2b02cc2adf864c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prftree.sty \
texlive-prftree"

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
