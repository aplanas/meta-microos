SUMMARY = "Wrapper for XeTeX's and LuaTeX's input normalization"
DESCRIPTION = "This package provides a cross engine interface to normalizing \
input before it's read by TeX. It is based on XeTeX's \
\\XeTeXinputnormalization primitive and lua-uni-algos for \
LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn59850"

RPM_NAME = "texlive-inputnormalization-2023.201.0.0.2svn59850-52.1.noarch.rpm"
RPM_HASH = "486246953feee2aa2a9f6dc37fba08f8777bc00182ec5c40e943a0fb5686aa75886195146a0d34c81a681b0f4357a82045989e264871fad14b4196c98ab6f884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inputnormalization.sty \
texlive-inputnormalization"

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
