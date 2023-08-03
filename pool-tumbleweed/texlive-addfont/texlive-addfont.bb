SUMMARY = "Easier use of fonts without LaTeX support"
DESCRIPTION = "This package is intended for use by users who know about fonts. \
It is a quick-fix for fonts which do not have genuine LaTeX \
support. It is not meant as a replacement of the LaTeX font \
definition files. It is meant as something more useable for \
LaTeX users than the \\newfont command. With addfont the loaded \
font scales along with the usual LaTeX size selection. Using \
this package still requires some knowledge on how to use fonts \
with LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn58559"

RPM_NAME = "texlive-addfont-2023.209.1.1svn58559-55.1.noarch.rpm"
RPM_HASH = "e70d41191d4288872153da92d9cd698aba8a02adc3fc9d845e95ec704fa36f08bdd7529d36d95a21930b7c04480605123e9d750880a037afd736d8e7e12d32a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-addfont.sty \
texlive-addfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-twoopt.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
