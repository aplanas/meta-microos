SUMMARY = "Modifies automatic mathematics spacing"
DESCRIPTION = "This package modifies two aspects of TeX's automatic interatom \
mathematics spacing. It uses LuaTeX's \\Umath primitives to make \
superscripts and subscripts more closely resemble \\textstyle \
and \\displaystyle math and to treat \\mathinner subformulas as \
\\mathord, effectively eliminating this class."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn57672"

RPM_NAME = "texlive-innerscript-2023.209.1.1svn57672-54.1.noarch.rpm"
RPM_HASH = "2b836604899a05f50344bdcac615119ac4a5aa00e3c581bef973b9886e48b44ca502924b657d580d97792b8c4f510b73f4bee5b812622c05adf989a1072b135e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-innerscript.sty \
texlive-innerscript"

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
