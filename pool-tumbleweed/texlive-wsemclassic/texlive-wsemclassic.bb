SUMMARY = "LaTeX class for Bavarian school w-seminar papers"
DESCRIPTION = "The class is designed either to conform with the \
recommendations of the Bavarian Kultusministerium for \
typesetting w-seminar papers (strict mode), or to use another \
style which should look better. The class is based on the LaTeX \
standard report class."
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.0.1svn31532"

RPM_NAME = "texlive-wsemclassic-2023.209.1.0.1svn31532-53.2.noarch.rpm"
RPM_HASH = "e44b045607cbe2245ca28b540f31e56afe0d1d8d32e94fc0af85ddfafb98e1edd17144c3ca0bd5f367d81596d62a0493657400312523d54cd2590d20dd6ff680"
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
