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

PV = "2023.201.1.1.3svn65269"

RPM_NAME = "texlive-latex2nemeth-2023.201.1.1.3svn65269-54.1.noarch.rpm"
RPM_HASH = "a7ec77be035be7de46bfa870d04acd5f65252f1b02406fc9c4df7f9d22d9e2b464cd7906606e5289fa08cf5f52e490b1411879dc5141a119ec11633c96ef4550"
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
