SUMMARY = "Picture drawing macros for TeX and LaTeX"
DESCRIPTION = "PicTeX is an early and very comprehensive drawing package that \
mostly draws by placing myriads of small dots to make up \
pictures. It has a tendency to run out of space; packages \
m-pictex and pictexwd deal with the problems in different ways."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn59551"

RPM_NAME = "texlive-pictex-2023.201.1.1bsvn59551-51.1.noarch.rpm"
RPM_HASH = "a6cb03505fcdcb0dd50225b28fe7ca0b718b3e2c62f92ea734a391aa6e6fd68ba73eaaefbe8faab7e7b6f1589d888e3b9c9ce16ad7f84fd4d27fd53a3bf6e18f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(errorbars.tex) \
tex(latexpicobjs.tex) \
tex(piccorr.sty) \
tex(picmore.tex) \
tex(pictex.sty) \
tex(pictex.tex) \
tex(pictexwd.sty) \
tex(pictexwd.tex) \
tex(pointers.tex) \
tex(postpictex.tex) \
tex(prepictex.tex) \
tex(texpictex.tex) \
tex(tree.sty) \
texlive-pictex"
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
