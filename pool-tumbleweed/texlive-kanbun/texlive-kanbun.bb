SUMMARY = "Typeset kanbun-kundoku with support for kanbun annotation"
DESCRIPTION = "This package allows users to manually input macros for elements \
in a kanbun-kundoku (Han Wen Xun Du ) paragraph. More \
importantly, it accepts plain text input in the 'kanbun \
annotation' form when used with LuaLaTeX, which allows \
typesetting kanbun-kundoku paragraphs efficiently."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn62026"

RPM_NAME = "texlive-kanbun-2023.209.1.2svn62026-56.1.noarch.rpm"
RPM_HASH = "8b7e70557c8374f32ce586367ea17f696de15d9452ed418be3240250c70618dc27d5e9371ef9be225c0ee703d072e523e641cad63d43c321e1192bda63aa870c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kanbun.sty \
texlive-kanbun"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-ifluatex.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
