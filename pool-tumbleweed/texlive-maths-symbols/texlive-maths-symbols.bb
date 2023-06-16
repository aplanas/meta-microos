SUMMARY = "Summary of mathematical symbols available in LaTeX"
DESCRIPTION = "A predecessor of the comprehensive symbols list, covering \
mathematical symbols available in standard LaTeX (including the \
AMS symbols, if available at compile time)."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn37763"

RPM_NAME = "texlive-maths-symbols-2023.201.3.4svn37763-52.1.noarch.rpm"
RPM_HASH = "f39d276e0607bb35b796e45998b5e15938fafadcf709ab0c7b0cfa1b26b17841c8c1029d2332b49286429a358de0fa7dfbeabbd719d0085306f4cadc4d1dee5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maths-symbols"

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
