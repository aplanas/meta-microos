SUMMARY = "Extend 'improperly closed environment' messages"
DESCRIPTION = "When an environment is left open, LaTeX gives an error at the \
end of the document. However it only informs about the first of \
them, while the rest are shown with meaningless errors: (\\end \
occurred inside a group at level N) This package replaces these \
errors with more useful messages which show which environments \
(in reverse order) were not closed. There are no user macros: \
just use the package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51475"

RPM_NAME = "texlive-checkend-2023.209.1.0svn51475-54.1.noarch.rpm"
RPM_HASH = "f07f1d7b0edd8d1fb8ba055159a36c4ea1cd94fc1e2ad69764ad9349e31a2d627dadd3544746a3a6cf2da73ef6103eed2aeafd0824260564572b884a334f1950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-checkend.sty \
texlive-checkend"

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
