SUMMARY = "BibLaTeX citation style covers the citation and bibliography guidelines for art historians"
DESCRIPTION = "This citation style covers the citation and bibliography \
guidelines of the Kunsthistorisches Institut der Universitat \
Bonn for undergraduates. It introduces bibliography entry types \
for catalogs and features a tabular bibliography, among other \
things. Various options are available to change and adjust the \
outcome according to one's own preferences. The style is \
compatible with English and German."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn46637"

RPM_NAME = "texlive-biblatex-arthistory-bonn-2023.209.1.2svn46637-54.1.noarch.rpm"
RPM_HASH = "50697e32c15651b803bc5d4ffd9441b222e3e8e1439ff12fd38997cbb193be8e6215789cffdd8c20b3329ae708d370c80d6d57e6b68755ecf01d4eafd0b066a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arthistory-bonn-english.lbx \
tex-arthistory-bonn-german.lbx \
tex-arthistory-bonn.bbx \
tex-arthistory-bonn.cbx \
texlive-biblatex-arthistory-bonn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-ibid.cbx \
tex-authoryear.bbx \
tex-csquotes.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
