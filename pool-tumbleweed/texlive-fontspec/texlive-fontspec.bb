SUMMARY = "Advanced font selection in XeLaTeX and LuaLaTeX"
DESCRIPTION = "Fontspec is a package for XeLaTeX and LuaLaTeX. It provides an \
automatic and unified interface to feature-rich AAT and \
OpenType fonts through the NFSS in LaTeX running on XeTeX or \
LuaTeX engines. The package requires the l3kernel and xparse \
bundles from the LaTeX3 development team."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.8asvn63386"

RPM_NAME = "texlive-fontspec-2023.209.2.8asvn63386-53.1.noarch.rpm"
RPM_HASH = "b755173cafdc9678a643b9af925df72847b8953b7c6fa72ab0b32e53db158c6717ddbb3d802c06c4cfb979db872d0a95c87dcba26476428cf5a747ec8bea9952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontspec-luatex.sty \
tex-fontspec-xetex.sty \
tex-fontspec.cfg \
tex-fontspec.sty \
texlive-fontspec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-luaotfload.sty \
tex-xparse.sty \
tex-xunicode.sty \
texlive \
texlive-euenc \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-l3packages \
texlive-lm \
texlive-scripts \
texlive-scripts-bin \
texlive-xunicode"

inherit rpm
