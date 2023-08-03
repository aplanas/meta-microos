SUMMARY = "Alphanumeric section numbering"
DESCRIPTION = "This package allows you to use alphanumeric section numbering, \
for instance 'A. Introduction ... III. International Law'. Its \
output is similar to alphanum, but you can use the standard \
LaTeX sectioning commands, so that it is possible to switch \
numbering schemes easily. Greek letters, double letters (bb) \
and different delimiters around them are supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn15878"

RPM_NAME = "texlive-alnumsec-2023.209.0.0.03svn15878-55.1.noarch.rpm"
RPM_HASH = "5f2aee315833f6ff426355690a2ffdcab33581c910de4683613a4681ecdb647f7761e64390a92b54fb02a8e2c71742fa80c0b3f440958cb94eebe10e723cfef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alnumsec.sty \
texlive-alnumsec"

RDEPENDS:${PN} += "/usr/bin/sh \
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
texlive-scripts-bin"

inherit rpm
