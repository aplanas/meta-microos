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

PV = "2023.201.svn34398"

RPM_NAME = "texlive-yplan-2023.201.svn34398-52.2.noarch.rpm"
RPM_HASH = "4f4559fc99bd88678bf341336468a6d2f8df5edff578ec8afed8c05f9e53650cc8200d153e597dd5d053c615cb48fb349314888f48032bfd98319335cd6aca4f"
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
