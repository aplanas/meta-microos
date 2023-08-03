SUMMARY = "Create Karnaugh maps with LaTeX"
DESCRIPTION = "This LaTeX package allows the creation of (even large) Karnaugh \
maps. It provides a tabular-like input syntax and support for \
drawing bundles (implicants) around adjacent values. It is \
based on an answer at StackExchange."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.5svn56361"

RPM_NAME = "texlive-kvmap-2023.209.0.0.3.5svn56361-56.1.noarch.rpm"
RPM_HASH = "5353edfff1a2268410b38a803482e303f912c42c47ecf44e79017f1b8459a07960ea0b193c45bdecf6d41bdbfc2ce0bc2289267f25caa859ed14710f83847d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kvmap.sty \
texlive-kvmap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-expl3.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-amsmath \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3experimental \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
