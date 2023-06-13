SUMMARY = "Make copies of text documents from within LaTeX"
DESCRIPTION = "This package provides \\VerbatimCopy{in}{out} that will enable \
LaTeX to take a verbatim copy of one text file, and save it \
under another name. The package provides a means to specify the \
output directory to be used, but does no checking and may \
therefore overwrite an important file if used injudiciously."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.06svn15878"

RPM_NAME = "texlive-verbatimcopy-2023.201.0.0.06svn15878-53.1.noarch.rpm"
RPM_HASH = "b3c5c6c622b93bafd3c04a1ac37d6fcf66e6935284cb00aeb817d26e6429d2f19d55b0441daec25ffaaba516b35e9c85301d3488d13f67fc8cc3455181a1a8d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(verbatimcopy.sty) \
texlive-verbatimcopy"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(verbatim.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
