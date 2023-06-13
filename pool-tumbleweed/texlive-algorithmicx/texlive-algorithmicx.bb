SUMMARY = "The algorithmic style you always wanted"
DESCRIPTION = "Algorithmicx provides a flexible, yet easy to use, way for \
inserting good looking pseudocode or source code in your \
papers. It has built in support for Pseudocode, Pascal and C, \
and offers powerful means to create definitions for any \
programming language. The user can adapt a Pseudocode style to \
his native language."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-algorithmicx-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "b6c36e72374bdb2a5c940efdae03c33dd537c18a4418307f7d5133da0cbd4e8d4dd7d6cce8b84ac1d179f92fbd279a53dade8bb10cc6d8e91ddcf094d3fb7ba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(algc.sty) \
tex(algcompatible.sty) \
tex(algmatlab.sty) \
tex(algorithmicx.sty) \
tex(algpascal.sty) \
tex(algpseudocode.sty) \
texlive-algorithmicx"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
