SUMMARY = "A Unicode font table generator"
DESCRIPTION = "This package produces font tables for unicode fonts as well as \
for 8bit fonts. The table layout can be adjusted in various \
ways including restricting the range of output to show only a \
portion of a specific font. To quickly produce a one-off table \
there is a stand-alone version unicodefont.tex that asks you a \
few questions and then generates the table --- somewhat similar \
to nfssfont.tex for 8-bit fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0gsvn65009"

RPM_NAME = "texlive-unicodefonttable-2023.209.1.0gsvn65009-54.1.noarch.rpm"
RPM_HASH = "3046a0f0984747a155c40ccb2d257d7ecd725346e81498d4851606998b8f33a5e69bad6cc85e9ae389d8aec2ff77893d43c1e19f88d313897ce280eec41bdbfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unicodefont.tex \
tex-unicodefonttable.sty \
texlive-unicodefonttable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-caption.sty \
tex-fontspec.sty \
tex-l3keys2e.sty \
tex-longtable.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
