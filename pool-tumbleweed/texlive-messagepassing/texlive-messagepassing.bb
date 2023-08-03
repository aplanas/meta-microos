SUMMARY = "Draw diagrams to represent communication protocols"
DESCRIPTION = "This package provides an environment to easily draw diagrams to \
represent communication protocols using message passing among \
processes. Processes are represented as horizontal or vertical \
lines, and communications as arrows between lines. The package \
also provides multiple macros to decorate those diagrams, for \
instance to annotate the diagram, to add crashes to the \
processes, checkpoints, ..."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn63116"

RPM_NAME = "texlive-messagepassing-2023.209.1.0svn63116-55.1.noarch.rpm"
RPM_HASH = "e4ccfef14d69546368f7f2505ea32d42f407a2100cdfdb00631378024f2e5326e9806a3ad987047c285459d36ea989cfd92c5a112f15c993213a89d9d48b8d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-messagepassing.sty \
texlive-messagepassing"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
