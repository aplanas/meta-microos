SUMMARY = "Daily planner type calendar"
DESCRIPTION = "Prints two six-monthly vertical-type daily planner (i.e., \
months along the top, days downwards), with each 6-month period \
fitting onto a single A4 (or US letter) sheet. The package \
offers support for English, French, German, Spanish and \
Portuguese. The previous scheme of annual updates has now been \
abandoned, in favour of a Perl script yplan that generates a \
year's planner automatically. (The last manually-generated \
LaTeX file remains on the archive.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn34398"

RPM_NAME = "texlive-yplan-2023.209.svn34398-53.1.noarch.rpm"
RPM_HASH = "bc4d02e6089cca20ac29d2a8c20a2dafab03de4f16f7914d499e7c26ca25a0e1dd69a2562614591fb80abe1f5e042579470010636062b3b57ff493884a1e2836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yplan.sty \
texlive-yplan"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-yplan-bin"

inherit rpm
