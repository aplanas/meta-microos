SUMMARY = "Wrapper for XeTeX's and LuaTeX's input normalization"
DESCRIPTION = "This package provides a cross engine interface to normalizing \
input before it's read by TeX. It is based on XeTeX's \
\\XeTeXinputnormalization primitive and lua-uni-algos for \
LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn59850"

RPM_NAME = "texlive-inputnormalization-2023.209.0.0.2svn59850-54.1.noarch.rpm"
RPM_HASH = "3d718819d0a7bc1d33c39c3b787236886a0d93f3c3fba4c2a432e916e2b47aa45b3da3db218869048b96a98128d071a1f2cfb73961dd69775fd33e7e3ba25a80"
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
