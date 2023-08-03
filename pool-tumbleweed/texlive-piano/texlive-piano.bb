SUMMARY = "Typeset a basic 2-octave piano diagram"
DESCRIPTION = "This package adds the \\keyboard[1][2]..[7] command to your \
project. When used, it draws a small 2 octaves piano keyboard \
on your document, with up to 7 keys highlighted. Keys go : Co, \
Cso, Do, Dso, Eo, Fo, Fso, Go, Gso, Ao, Aso, Bo, Ct, Cst, Dt, \
Dst, Et, Ft, Fst, Gt, Gst, At, Ast and Bt. (A working example \
is included in the README file.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21574"

RPM_NAME = "texlive-piano-2023.209.1.0svn21574-52.1.noarch.rpm"
RPM_HASH = "38d2f6e8d48ea2bdc3680730f0117bcb1a4118e6c54e2c08b0a0adc34314a160c3181779c6e5ebdb44f02f2346a73da9ee8f220ddd67b4afa127be8b82f31e35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-piano.sty \
texlive-piano"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ifthen.sty \
tex-xargs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
