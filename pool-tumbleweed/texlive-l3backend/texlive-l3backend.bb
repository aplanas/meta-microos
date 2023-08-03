SUMMARY = "LaTeX3 backend drivers"
DESCRIPTION = "This package forms parts of expl3, and contains the code used \
to interface with backends (drivers) across the expl3 codebase. \
The functions here are defined differently depending on the \
engine in use. As such, these are distributed separately from \
l3kernel to allow this code to be updated on an independent \
schedule."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65573"

RPM_NAME = "texlive-l3backend-2023.209.svn65573-56.1.noarch.rpm"
RPM_HASH = "0140e2fdc3205c2bf7c182ca25bcd378a5e3942e49f5edb0e5bb0400a2969908877a1deac9a078e410c671fbef706f7dee750fc14852cb0dd1d3447f6cd3e2b3"
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
