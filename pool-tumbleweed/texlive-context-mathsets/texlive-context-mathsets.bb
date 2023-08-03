SUMMARY = "Set notation in ConTeXt"
DESCRIPTION = "Typeset good-looking set notation (e.g., {x|x \\in Y}), as well \
as similar things such as Dirac bra-ket notation, conditional \
probabilities, etc. The package is at least inspired by braket."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-mathsets-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "2c3142e8852648d9ba87f9d799fd126514013c0a0e39704f95670570cf8aef4af724bd57384c27399f83423934751ec5445e61d67b59ee6db8b3170885c18a78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-mathsets.tex \
texlive-context-mathsets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
