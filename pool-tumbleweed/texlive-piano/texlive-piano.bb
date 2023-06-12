SUMMARY = "Typeset a basic 2-octave piano diagram"
DESCRIPTION = "This package adds the \\keyboard[1][2]..[7] command to your \
project. When used, it draws a small 2 octaves piano keyboard \
on your document, with up to 7 keys highlighted. Keys go : Co, \
Cso, Do, Dso, Eo, Fo, Fso, Go, Gso, Ao, Aso, Bo, Ct, Cst, Dt, \
Dst, Et, Ft, Fst, Gt, Gst, At, Ast and Bt. (A working example \
is included in the README file.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21574"

RPM_NAME = "texlive-piano-2023.201.1.0svn21574-51.1.noarch.rpm"
RPM_HASH = "3dd943a039d555f3b1357bd4b107e96f5b0eaa89e8fefeea4d1eb4e18df96df7dba477f235ed9e7f5ff8bdf43e745e652ac7a101d1b21c37f5ff9d4e3acd29d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(piano.sty) \
texlive-piano"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(ifthen.sty) \
tex(xargs.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
