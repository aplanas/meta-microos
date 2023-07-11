SUMMARY = "Drawing spectral sequences in LuaLaTeX"
DESCRIPTION = "The package is an update of the author's sseq package, for use \
with LuaLaTeX. This version uses less memory, and operates \
faster than the original; it also offers several enhancements."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65511"

RPM_NAME = "texlive-luasseq-2023.208.svn65511-53.1.noarch.rpm"
RPM_HASH = "471610c3140442f4913148f6a6c368d9676194198086ab51e0c59a4bfb5d3fc81a8838709999947a725feacb1d38b0fad1894556a73276ea06bccea799603348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luasseq.sty \
texlive-luasseq"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pgf.sty \
tex-pifont.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
