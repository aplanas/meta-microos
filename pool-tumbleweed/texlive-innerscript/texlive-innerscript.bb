SUMMARY = "Modifies automatic mathematics spacing"
DESCRIPTION = "This package modifies two aspects of TeX's automatic interatom \
mathematics spacing. It uses LuaTeX's \\Umath primitives to make \
superscripts and subscripts more closely resemble \\textstyle \
and \\displaystyle math and to treat \\mathinner subformulas as \
\\mathord, effectively eliminating this class."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn57672"

RPM_NAME = "texlive-innerscript-2023.201.1.1svn57672-52.1.noarch.rpm"
RPM_HASH = "69562b5f647d2db87bf8c5efc94f88d6d4c52483eafba1270f64510d6a6485e2a5efcc3f923cffc66784104a91e9cc33171b8fc954940168e2d4d2c69f813235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(innerscript.sty) \
texlive-innerscript"

RDEPENDS:${PN} += "/bin/sh \
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
