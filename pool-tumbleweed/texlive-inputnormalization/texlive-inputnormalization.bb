SUMMARY = "Wrapper for XeTeX's and LuaTeX's input normalization"
DESCRIPTION = "This package provides a cross engine interface to normalizing \
input before it's read by TeX. It is based on XeTeX's \
\\XeTeXinputnormalization primitive and lua-uni-algos for \
LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2svn59850"

RPM_NAME = "texlive-inputnormalization-2023.208.0.0.2svn59850-53.1.noarch.rpm"
RPM_HASH = "e19adcb158aaa5804d80f463c974e9e029d0ebb4e99bdf50766b68a873df2cfcd91d70f1f14000384daa5e73692adcdc3511ff7668ec0ebd7515bf43e4d94dd0"
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
