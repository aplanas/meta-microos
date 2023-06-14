SUMMARY = "Annotation symbols enclosed in square brackets and marked with an asterisk"
DESCRIPTION = "This LaTeX package can output annotation symbols enclosed in \
square brackets and marked with an asterisk."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63838"

RPM_NAME = "texlive-asternote-2023.201.1.1svn63838-53.1.noarch.rpm"
RPM_HASH = "04e6f4a2fc8a166fe2dea7bf7cd7e9a0cbf784379abf547fb201b0a87fccab231b7024c48302e65bdff55dda09df0ee808796ec3333860e18318cb5c9d4d5ac5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asternote.sty \
texlive-asternote"

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
