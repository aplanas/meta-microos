SUMMARY = "Extensive maths for LuaTeX"
DESCRIPTION = "This package provides a simple and highly configurable way to \
use Unicode and OpenType mathematics with simple LuaTeX, taking \
advantage of most of the engine's new capabilities in \
mathematical typesetting. Also included are the proper settings \
and definitions for almost all Unicode mathematical characters."
LICENSE = "LPPL-1.0"

PV = "2023.209.2023_1.2svn66395"

RPM_NAME = "texlive-minim-math-2023.209.2023_1.2svn66395-55.1.noarch.rpm"
RPM_HASH = "c71b52eba8c86be060f1b3021500e39b45b5fccd980d74b394efb0c8f09f11afb9b5d871fe175f36ef205e5bf3128c4d4c094d2f8953f5318c714aab5f6351d8"
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
