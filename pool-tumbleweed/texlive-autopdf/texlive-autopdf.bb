SUMMARY = "Conversion of graphics to pdfLaTeX-compatible formats"
DESCRIPTION = "The package facilitates the on-the-fly conversion of various \
graphics formats to formats supported by pdfLaTeX (e.g. PDF). \
It uses a range of external programs, and therefore requires \
that the LaTeX run starts with write18 enabled."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn32377"

RPM_NAME = "texlive-autopdf-2023.209.1.1svn32377-54.1.noarch.rpm"
RPM_HASH = "e8740dbbcd7c32909b8208ac2095fa0ba8b0ad246e591b8a9586defcf6f69e286a48ad3380879043663cba1d74c9622d48f6fb3d4b9055e892b30bb62f08b425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autopdf.sty \
texlive-autopdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-psfrag.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
