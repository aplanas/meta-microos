SUMMARY = "LaTeX support for the wasy fonts"
DESCRIPTION = "The wasy (Waldi Symbol) font by Roland Waldi provides many \
glyphs like male and female symbols and astronomical symbols, \
as well as the complete lasy font set and other odds and ends. \
This package implements an easy to use interface for these \
symbols."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn54080"

RPM_NAME = "texlive-wasysym-2023.209.2.4svn54080-54.1.noarch.rpm"
RPM_HASH = "3a42d93c7d658346d4307efbd553b9198c02217b2a56fa2c9b1b6d3fb5526f29944ddb44c33eb7159c309c549a80552552bd913de04055c20a81db29e7abac93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwasy.fd \
tex-uwasyvar.fd \
tex-wasysym.sty \
texlive-wasysym"

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
