SUMMARY = "Convert LaTeX source to Braille with math in Nemeth"
DESCRIPTION = "After many failed attempts to transcribe real math notes and \
books to Braille/Nemeth in order to deal with a real situation \
(blind student in Math Dept.), we decided to develop a new \
program that follows a direct, from LaTeX to Braille/Nemeth, \
approach. Our main target was the Greek language which is only \
Braille level 1, but English at level 1 is supported as well. \
Simple pictures in PSTricks are also supported in order to \
produce tactile graphics with specialized equipment. Note that \
embossing will need LibreOffice and odt2braille as this project \
does not deal with embossers' drivers. What's new in version \
1.1 In this version, the support of the user level commands of \
the amsmath package was added, as described in its user guide, \
with the exception of commutative diagrams (amscd package) as \
well as structures that are irrelevant to visually impared \
persons. Also, the Unicode mathematics symbols of the \
unicode-math package that are represented by the Nemeth code \
are now supported by latex2nemeth. We would like to acknowledge \
support by the TUGfund for this project (TUGfund project 33)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1.3svn65269"

RPM_NAME = "texlive-latex2nemeth-2023.209.1.1.3svn65269-55.1.noarch.rpm"
RPM_HASH = "0960a9b016f30bedcc61d7c8db410c7c1302f6697da7f0e7a152605290cdde9f587421fa207ff14b414e2c263c99e42d573fffffc853c596c449732e079cbcf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latex2nemeth.jar \
texlive-latex2nemeth"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex2nemeth-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
