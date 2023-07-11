SUMMARY = "Modifies automatic mathematics spacing"
DESCRIPTION = "This package modifies two aspects of TeX's automatic interatom \
mathematics spacing. It uses LuaTeX's \\Umath primitives to make \
superscripts and subscripts more closely resemble \\textstyle \
and \\displaystyle math and to treat \\mathinner subformulas as \
\\mathord, effectively eliminating this class."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn57672"

RPM_NAME = "texlive-innerscript-2023.208.1.1svn57672-53.1.noarch.rpm"
RPM_HASH = "44a1821057fd9a89f0073c0b3e1f5d4e900bf2a860baf44bc8750aa17bbe5f65b60da1f5f1ae592bf7f20f6f49921924f496496781850886590e2225eb3a6950"
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
