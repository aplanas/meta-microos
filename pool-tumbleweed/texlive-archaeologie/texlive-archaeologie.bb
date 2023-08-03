SUMMARY = "A citation-style which covers rules of the German Archaeological Institute"
DESCRIPTION = "This citation-style covers the citation and bibliography rules \
of the German Archaeological Institute (DAI). Various options \
are available to change and adjust the outcome according to \
one's own preferences."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4.5svn57090"

RPM_NAME = "texlive-archaeologie-2023.209.2.4.5svn57090-55.1.noarch.rpm"
RPM_HASH = "7bc0c17a1acdceca79272118e76615b9d733763918ad11a0c5eb23f09fdb5e49e800c56cda2a0bf7a2eeeefd74c6380327d53aab1560e92d4f4c5a1a8313fe66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-archaeologie.bbx \
tex-archaeologie.cbx \
tex-english-archaeologie.lbx \
tex-french-archaeologie.lbx \
tex-german-archaeologie.lbx \
tex-italian-archaeologie.lbx \
tex-spanish-archaeologie.lbx \
texlive-archaeologie"

RDEPENDS:${PN} += "/usr/bin/sh \
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
