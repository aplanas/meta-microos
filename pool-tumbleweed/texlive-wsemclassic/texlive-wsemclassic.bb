SUMMARY = "LaTeX class for Bavarian school w-seminar papers"
DESCRIPTION = "The class is designed either to conform with the \
recommendations of the Bavarian Kultusministerium for \
typesetting w-seminar papers (strict mode), or to use another \
style which should look better. The class is based on the LaTeX \
standard report class."
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.0.1svn31532"

RPM_NAME = "texlive-wsemclassic-2023.201.1.0.1svn31532-52.1.noarch.rpm"
RPM_HASH = "ba8d3fca264b2d32a0267cf3ad75272ac775afff4e8b2c9fc8d3f6f93bbcdf26332e50d8c3055e75a2e489571b8875ee1b75f0ffc1d428ac3d4c37e91c2fb71c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(wsemclassic.cls) \
texlive-wsemclassic"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(babel.sty) \
tex(babelbib.sty) \
tex(fancyhdr.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(geometry.sty) \
tex(hyperref.sty) \
tex(iftex.sty) \
tex(inputenx.sty) \
tex(kvoptions.sty) \
tex(microtype.sty) \
tex(natbib.sty) \
tex(polyglossia.sty) \
tex(setspace.sty) \
tex(soulutf8.sty) \
tex(titlesec.sty) \
tex(tocbibind.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
