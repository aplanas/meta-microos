SUMMARY = "Advanced font selection in XeLaTeX and LuaLaTeX"
DESCRIPTION = "Fontspec is a package for XeLaTeX and LuaLaTeX. It provides an \
automatic and unified interface to feature-rich AAT and \
OpenType fonts through the NFSS in LaTeX running on XeTeX or \
LuaTeX engines. The package requires the l3kernel and xparse \
bundles from the LaTeX3 development team."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.8asvn63386"

RPM_NAME = "texlive-fontspec-2023.201.2.8asvn63386-52.1.noarch.rpm"
RPM_HASH = "0a10c9cbbe222794a6a2996eebccae5b85918b1c161c7d314d87ea323cf0fcafcff6d264bd16385da0775f1b0009a0387ec30c2d319df43085b4fccf8cc39680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fontspec-luatex.sty) \
tex(fontspec-xetex.sty) \
tex(fontspec.cfg) \
tex(fontspec.sty) \
texlive-fontspec"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontenc.sty) \
tex(luaotfload.sty) \
tex(xparse.sty) \
tex(xunicode.sty) \
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
