SUMMARY = "The algorithmic style you always wanted"
DESCRIPTION = "Algorithmicx provides a flexible, yet easy to use, way for \
inserting good looking pseudocode or source code in your \
papers. It has built in support for Pseudocode, Pascal and C, \
and offers powerful means to create definitions for any \
programming language. The user can adapt a Pseudocode style to \
his native language."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-algorithmicx-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "0c41f8ad7233ed704f9aeaa5c7dc1ed2264c0afeede5b146f09d58e0e7c11c1a8c69ad72342b2b01a8d3846ad733c8c6f917ed3d3a7fed0ae9219f2b1dbca817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algc.sty \
tex-algcompatible.sty \
tex-algmatlab.sty \
tex-algorithmicx.sty \
tex-algpascal.sty \
tex-algpseudocode.sty \
texlive-algorithmicx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
