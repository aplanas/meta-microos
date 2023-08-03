SUMMARY = "Multiple choice questionnaires in two column tables"
DESCRIPTION = "The alterqcm package is a LaTeX2e package, for making multiple \
choices questionnaires in a table with two columns. The aim is \
to provide some useful macros to build QCM in tables. These \
macros may be used by only LaTeX TeX users. The package works \
with utf8, pdfLaTeX, LuaLaTeX and XeLaTeX (with some \
languages). The documentation is in English."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.42csvn59265"

RPM_NAME = "texlive-alterqcm-2023.209.4.42csvn59265-55.1.noarch.rpm"
RPM_HASH = "c2f4689dea2950faff988b98aace8c4582d8b9cf17676d9df63e61f7fb6fffcd8f754661a5a5f7b5537529a12e077f9eda4fb47ac73624d9dd3162673abbae7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alterqcm.sty \
texlive-alterqcm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-ifthen.sty \
tex-multirow.sty \
tex-pifont.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
