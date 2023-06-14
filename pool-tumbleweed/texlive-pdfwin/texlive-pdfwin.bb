SUMMARY = "Customizable windows for screen viewing of TeX documents"
DESCRIPTION = "Inspired by the pdfscreen package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-pdfwin-2023.201.svn54074-51.1.noarch.rpm"
RPM_HASH = "114628f1ffbd38fb81eb3691875862a40097745493fb21a4e560d6ab940311eb5049334ac8c44475e7e59f3e72cf6d2ea7818892b32e7f3991360aba6e3540e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfwin.cfg \
tex-pdfwin.sty \
texlive-pdfwin"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-color.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-truncate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
