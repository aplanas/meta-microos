SUMMARY = "Make copies of text documents from within LaTeX"
DESCRIPTION = "This package provides \\VerbatimCopy{in}{out} that will enable \
LaTeX to take a verbatim copy of one text file, and save it \
under another name. The package provides a means to specify the \
output directory to be used, but does no checking and may \
therefore overwrite an important file if used injudiciously."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.06svn15878"

RPM_NAME = "texlive-verbatimcopy-2023.209.0.0.06svn15878-54.1.noarch.rpm"
RPM_HASH = "a43595c647055db91346c9d47d85ee87254d709609222507471a2dab2b1c6abc3b89a02724e24a5de5efa7603e7f3bddd5c69aed98e3dd162cf23ba2a1608764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verbatimcopy.sty \
texlive-verbatimcopy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
