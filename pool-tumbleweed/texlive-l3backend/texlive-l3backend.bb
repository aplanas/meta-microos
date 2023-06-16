SUMMARY = "LaTeX3 backend drivers"
DESCRIPTION = "This package forms parts of expl3, and contains the code used \
to interface with backends (drivers) across the expl3 codebase. \
The functions here are defined differently depending on the \
engine in use. As such, these are distributed separately from \
l3kernel to allow this code to be updated on an independent \
schedule."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65573"

RPM_NAME = "texlive-l3backend-2023.201.svn65573-55.1.noarch.rpm"
RPM_HASH = "8a1ca05559abf7fe4030569b36299411b60e6612ccce466735680a009c5517618d94d00c5f74d617fb73121fc6af01e4a7b8ca5415c07e09a3d8a8e39941468b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-l3backend-dvipdfmx.def \
tex-l3backend-dvips.def \
tex-l3backend-dvisvgm.def \
tex-l3backend-luatex.def \
tex-l3backend-pdftex.def \
tex-l3backend-xetex.def \
texlive-l3backend"

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
