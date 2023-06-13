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

PV = "2023.201.0.0.25svn18835"

RPM_NAME = "texlive-accfonts-2023.201.0.0.25svn18835-54.1.noarch.rpm"
RPM_HASH = "82bc1ee8f129894156af92e9aeb1024379d72f4299edcda71a65813698fc32f388d0ad33ab66a95f55ce033b647ebbaca79405ed2cb25dc7be3d55b4c6736eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(CSX.def) \
tex(ISO-Latin1.def) \
tex(ISO-Latin2.def) \
tex(IndUni_Omega.def) \
tex(Norman.def) \
texlive-accfonts"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(File::Basename) \
perl(Getopt::Std) \
sed \
texlive \
texlive-accfonts-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
