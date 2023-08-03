SUMMARY = "Using the free ASAP Symbol font with LaTeX and Plain TeX"
DESCRIPTION = "The package provides macros (usable with LaTeX or Plain TeX) \
for using the freely available ASAP Symbol font, which is also \
included. The font is distributed in OpenType format, and makes \
extensive use of OpenType features. Therefore, at this time, \
only XeTeX and LuaTeX are supported. An error message is issued \
if an OTF-capable engine is not detected."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn40201"

RPM_NAME = "texlive-asapsym-2023.209.1.0svn40201-54.1.noarch.rpm"
RPM_HASH = "d2728dc6c5869b68049b2618e290c7fc4697f5e82a5821713b6c65d410c3a79464342026cfb8be8f48edbc7f33e82612cbb43e3dbb5fbe46c35dc5776fde38b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asapsym-generic.tex \
tex-asapsym.code.tex \
tex-asapsym.sty \
texlive-asapsym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
texlive \
texlive-asapsym-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
