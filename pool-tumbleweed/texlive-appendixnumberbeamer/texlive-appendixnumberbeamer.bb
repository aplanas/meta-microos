SUMMARY = "Manage frame numbering in appendixes in beamer"
DESCRIPTION = "This package fixes the frame numbering in beamer when using an \
appendix such that the slides from the appendix are not counted \
in the total frame number of the main part of the document. The \
total frame number counter is reset to 0 when entering the \
appendix. The standard usage is to include \
\\usepackage{appendixnumberbeamer} in the preamble and then \
declare the beginning of the appendix as usual using the \
\\appendix command."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.2svn46317"

RPM_NAME = "texlive-appendixnumberbeamer-2023.201.1.2svn46317-54.1.noarch.rpm"
RPM_HASH = "19ff6108c8d08a1329427f5fa20ea00a32e8406103b288753b0b16a98097fc8bcad1785e0311a3aec7ecef512995e6551cdbd31f3accf93b6e8b45eebe8bc8ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-appendixnumberbeamer.sty \
texlive-appendixnumberbeamer"

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
