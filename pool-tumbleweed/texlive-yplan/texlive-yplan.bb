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

RPM_NAME = "texlive-yplan-2023.209.svn34398-53.2.noarch.rpm"
RPM_HASH = "add8741c7b7144292c37ed7fe04be33f53936319163d448476c3fe9f25db63f35edcd87482735424740470801a92fe2671e3d201b6f6cbf336929fadedfeaca6"
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
