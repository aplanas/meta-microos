SUMMARY = "Unicode mathematics support for XeTeX and LuaTeX"
DESCRIPTION = "This package will provide a complete implementation of unicode \
maths for XeLaTeX and LuaLaTeX. Unicode maths is currently \
supported by the following freely available fonts: Latin Modern \
Math (Boguslaw Jackowski, Janusz M. Nowacki), TeX Gyre Bonum \
Math (Boguslaw Jackowski, , P. Strzelczyk, Janusz M. Nowacki), \
TeX Gyre Pagella Math (Boguslaw Jackowski, , P. Strzelczyk, \
Janusz M. Nowacki), TeX Gyre Schola Math (Boguslaw Jackowski, \
P. Strzelczyk, Janusz M. Nowacki), TeX Gyre Termes Math \
(Boguslaw Jackowski, P. Strzelczyk, Janusz M. Nowacki), DejaVu \
Math TeX Gyre (Boguslaw Jackowski, P. Strzelczyk, Janusz M. \
Nowacki), Asana-Math fonts (Apostolos Syropolous), STIX (STI \
Pub), XITS Math (Khaled Hosny), Libertinus Math (Philipp H. \
Poll and Khaled Hosny), and Fira Math (Xiangdong Zeng). The \
following fonts are proprietary with OpenType maths support: \
Lucida Bright Math (Charles Bigelow and Kris Holmes), Cambria \
Math (Microsoft), Minion Math (Johannes Kuster, typoma GmbH). \
As well as running XeTeX or LuaTeX, this package requires \
recent versions of the fontspec, expl3, xpackages, ucharcat and \
lualatex-math packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8qsvn61719"

RPM_NAME = "texlive-unicode-math-2023.209.0.0.8qsvn61719-54.1.noarch.rpm"
RPM_HASH = "4a00670ff5b59a9a6a1cecdd7f1dc009d76558c3f2855af04ddb02455d0364bff860dfdf99f14205e49652efb5ea0673954e38b222c908c234c84f023defcbf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unicode-math-luatex.sty \
tex-unicode-math-table.tex \
tex-unicode-math-xetex.sty \
tex-unicode-math.sty \
texlive-unicode-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-expl3.sty \
tex-fix-cm.sty \
tex-fontspec.sty \
tex-l3keys2e.sty \
tex-lualatex-math.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-fontspec \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lm-math \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
