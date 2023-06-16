SUMMARY = "Extensive maths for LuaTeX"
DESCRIPTION = "This package provides a simple and highly configurable way to \
use Unicode and OpenType mathematics with simple LuaTeX, taking \
advantage of most of the engine's new capabilities in \
mathematical typesetting. Also included are the proper settings \
and definitions for almost all Unicode mathematical characters."
LICENSE = "LPPL-1.0"

PV = "2023.201.2023_1.2svn66395"

RPM_NAME = "texlive-minim-math-2023.201.2023_1.2svn66395-54.1.noarch.rpm"
RPM_HASH = "159499ff3b61b61a59b423b59365cd94b599cb1e997e3600974d12aba9f2ecd9f46be4c558354a7901998ed866b2fd6bebe01582ec9a757c352377a8595e83c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minim-math.tex \
texlive-minim-math"

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
