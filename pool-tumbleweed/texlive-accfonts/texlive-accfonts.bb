SUMMARY = "Utilities to derive new fonts from existing ones"
DESCRIPTION = "The accfonts package contains three utilities to permit easy \
manipulation of fonts, in particular the creation of unusual \
accented characters. Mkt1font works on Adobe Type 1 fonts, \
vpl2vpl works on TeX virtual fonts and vpl2ovp transforms a TeX \
font to an Omega one. All three programs read in a font (either \
the font itself or a property list), together with a simple \
definition file containing lines such as '128 z acute'; they \
then write out a new version of the font with the requested new \
characters in the numerical slots specified. Great care is \
taken over the positioning of accents, and over the provision \
of kerning information for new characters; mkt1font also \
generates suitable 'hints' to enhance quality at small sizes or \
poor resolutions. The programs are written in Perl."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.25svn18835"

RPM_NAME = "texlive-accfonts-2023.209.0.0.25svn18835-55.1.noarch.rpm"
RPM_HASH = "64fedb3727a8a8a4e005bf3a398a809a59ea68cfb40202ff5fb920fdcdc94ce9add530ecdc7a859dfa21c9c30e5923f42a0ea38724107ff147443e0eb319a98d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CSX.def \
tex-ISO-Latin1.def \
tex-ISO-Latin2.def \
tex-IndUni-Omega.def \
tex-Norman.def \
texlive-accfonts"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-Getopt--Std \
sed \
texlive \
texlive-accfonts-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
