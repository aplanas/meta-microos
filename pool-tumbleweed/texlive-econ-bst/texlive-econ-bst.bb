SUMMARY = "BibTeX style for economics papers"
DESCRIPTION = "This is a BibTeX style file for papers in economics. It \
provides the following features: author-year type citation \
reference style used in economics papers highly customizable \
use of 'certified random order' as proposed by Ray Robson \
(2018)"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1.1svn61499"

RPM_NAME = "texlive-econ-bst-2023.209.3.1.1svn61499-54.2.noarch.rpm"
RPM_HASH = "3c948605e60371785cf237dc248e8e50f210e395b60c55bc60a2858d7d821b1a30547fd33bd36b8a28642194c9ed3df8a55c4ebe2dc51aa9717918237fb4bc0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econ-bst"

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
