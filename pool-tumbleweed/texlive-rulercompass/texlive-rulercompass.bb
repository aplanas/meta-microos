SUMMARY = "A TikZ library for straight-edge and compass diagrams"
DESCRIPTION = "The package defines some commands and styles to support drawing \
straight-edge and compass diagrams with TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn32392"

RPM_NAME = "texlive-rulercompass-2023.209.1svn32392-54.1.noarch.rpm"
RPM_HASH = "1911560ca9c5b5ad280c359326e22c868b9424b15c4ddc17d4880fb095362eebf301b145d4110d3efcb4db3831ce20c73b15096ea14b69c8ee7283468963463f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryrulercompass.code.tex \
texlive-rulercompass"

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
