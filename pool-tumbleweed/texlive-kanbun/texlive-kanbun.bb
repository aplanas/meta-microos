SUMMARY = "Typeset kanbun-kundoku with support for kanbun annotation"
DESCRIPTION = "This package allows users to manually input macros for elements \
in a kanbun-kundoku (Han Wen Xun Du ) paragraph. More \
importantly, it accepts plain text input in the 'kanbun \
annotation' form when used with LuaLaTeX, which allows \
typesetting kanbun-kundoku paragraphs efficiently."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn62026"

RPM_NAME = "texlive-kanbun-2023.201.1.2svn62026-55.1.noarch.rpm"
RPM_HASH = "c916e7e6c73945dc1f794006d278e22a2cf60b86db4c00cfa739453fc55cc271d28a1a1c1eceb1c3df1c379a81268b585a0922b148b3fdc902dd0cdb320c8aac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(kanbun.sty) \
texlive-kanbun"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(ifluatex.sty) \
tex(l3keys2e.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
