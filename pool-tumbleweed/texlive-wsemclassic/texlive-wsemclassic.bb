SUMMARY = "LaTeX class for Bavarian school w-seminar papers"
DESCRIPTION = "The class is designed either to conform with the \
recommendations of the Bavarian Kultusministerium for \
typesetting w-seminar papers (strict mode), or to use another \
style which should look better. The class is based on the LaTeX \
standard report class."
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.0.1svn31532"

RPM_NAME = "texlive-wsemclassic-2023.201.1.0.1svn31532-52.2.noarch.rpm"
RPM_HASH = "957dcaffa36624d263d1c58df30eae238c505c954eee8b792dbb533b680676f9693b420eb988fec0edf2e0f9283451cbc74070d9dea05f492c82749d68cc75e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wsemclassic.cls \
texlive-wsemclassic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-babelbib.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-inputenx.sty \
tex-kvoptions.sty \
tex-microtype.sty \
tex-natbib.sty \
tex-polyglossia.sty \
tex-setspace.sty \
tex-soulutf8.sty \
tex-titlesec.sty \
tex-tocbibind.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
