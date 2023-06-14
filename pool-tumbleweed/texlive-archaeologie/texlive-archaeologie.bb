SUMMARY = "A citation-style which covers rules of the German Archaeological Institute"
DESCRIPTION = "This citation-style covers the citation and bibliography rules \
of the German Archaeological Institute (DAI). Various options \
are available to change and adjust the outcome according to \
one's own preferences."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4.5svn57090"

RPM_NAME = "texlive-archaeologie-2023.201.2.4.5svn57090-54.1.noarch.rpm"
RPM_HASH = "a958679f8bac2c4d2787ab58cc46f472703aa4bdbf87ac048006bb70d34d413c58b4eb8cb1b3df4e1b79ccc212d692f6d1a4567eb781b8229648cb64c925cc36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-archaeologie.bbx \
tex-archaeologie.cbx \
tex-english-archaeologie.lbx \
tex-french-archaeologie.lbx \
tex-german-archaeologie.lbx \
tex-italian-archaeologie.lbx \
tex-spanish-archaeologie.lbx \
texlive-archaeologie"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-standard.bbx \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
