SUMMARY = "BibLaTeX style for the New England Journal of Medicine (NEJM)"
DESCRIPTION = "This is a BibLaTeX numeric style based on the design of the New \
England Journal of Medicine (NEJM)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.0svn49839"

RPM_NAME = "texlive-biblatex-nejm-2023.209.0.0.5.0svn49839-54.1.noarch.rpm"
RPM_HASH = "31fbf8e4311874f69bbc22b6c30063d7cd2787003e06707126bdff61bce13d789898af110b41fa33c4155729659e3074167abe96bf3c87e4a0cd1edd85bf15f7"
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
