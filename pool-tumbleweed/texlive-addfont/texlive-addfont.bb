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

PV = "2023.201.1.1svn58559"

RPM_NAME = "texlive-addfont-2023.201.1.1svn58559-54.1.noarch.rpm"
RPM_HASH = "6ed7e0c1d75bf0fe0f21526673b8235ca949cfd4c115dfcfa9341bc512cb921723f7746b73e4f26db7bf9ccf60c3cf3737bd306a254345c4cfb3fd90576f4821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(addfont.sty) \
texlive-addfont"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(twoopt.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
