SUMMARY = "Macros for Segmented Discourse Representation Theory"
DESCRIPTION = "The package provides macros to produce the 'Box notation' of \
SDRT (and DRT), to draw trees representing discourse relations, \
and finally to have an easy access to various mathematical \
symbols used in that theory, mostly with automatic mathematics \
mode, so they work the same in formulae and in text."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-sdrt-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "415e9e5b905f9bdf1bfa538d98f2b077964011c23b976103d231750cb5768fbe939baeaf723cc58d12374a55080093406d8a01f90c4bae34cb8b5f6fc2e6de9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sdrt.sty \
texlive-sdrt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-xyling.sty \
tex-xytree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
