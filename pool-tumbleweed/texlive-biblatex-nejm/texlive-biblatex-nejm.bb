SUMMARY = "BibLaTeX style for the New England Journal of Medicine (NEJM)"
DESCRIPTION = "This is a BibLaTeX numeric style based on the design of the New \
England Journal of Medicine (NEJM)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.0svn49839"

RPM_NAME = "texlive-biblatex-nejm-2023.201.0.0.5.0svn49839-53.1.noarch.rpm"
RPM_HASH = "86f9ce08438ada09505056f09fd35c98288d2ad5024c687f2367dd67f30ff34cb28a5eba5c6b053dd8be4f6f8904568d157d14b0cecd80dc34f08cf86f124a56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nejm.bbx \
tex-nejm.cbx \
texlive-biblatex-nejm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric-comp.cbx \
tex-numeric.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
