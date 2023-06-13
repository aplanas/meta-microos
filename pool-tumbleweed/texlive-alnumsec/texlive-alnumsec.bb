SUMMARY = "Alphanumeric section numbering"
DESCRIPTION = "This package allows you to use alphanumeric section numbering, \
for instance 'A. Introduction ... III. International Law'. Its \
output is similar to alphanum, but you can use the standard \
LaTeX sectioning commands, so that it is possible to switch \
numbering schemes easily. Greek letters, double letters (bb) \
and different delimiters around them are supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn15878"

RPM_NAME = "texlive-alnumsec-2023.201.0.0.03svn15878-54.1.noarch.rpm"
RPM_HASH = "bcd0465af3f3d5e2af02b6b85a953d5b416c71e8c7dc779dc4e511fc3764b4e874c3107a0bf5f59ddd8050acf5b91a05971c249e94a43d488e771575771501bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(alnumsec.sty) \
texlive-alnumsec"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
