SUMMARY = "Alternating pronouns to aid gender-neutral writing"
DESCRIPTION = "The package implements a version of semi-automatic pronoun \
switching for writing gender-neutral (and possibly annoying) \
prose. It has upper- and lowercase versions of switching \
pronouns for all case forms, plus anaphoric versions that \
reflect the current gender choice."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn41359"

RPM_NAME = "texlive-he-she-2023.209.1.3svn41359-54.2.noarch.rpm"
RPM_HASH = "c42020ea2bb48f750a703c5c9cda29117c760f35203d2ae3be9881c924ce495fa75cf9cfac8402267c57e42dc10de274e99f3228262a28f28bb7a8bf5d459d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-he-she.sty \
texlive-he-she"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everyhook.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
