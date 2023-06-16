SUMMARY = "MLA style files for BibLaTeX"
DESCRIPTION = "The package provides BibLaTeX support for citations in the \
format specified by the MLA handbook."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1asvn62138"

RPM_NAME = "texlive-biblatex-mla-2023.201.2.1asvn62138-53.1.noarch.rpm"
RPM_HASH = "81873bb8e911818eed398c7688fe3120de9b33e02f7d400666af5bd9862fefab229f6076de3964eb21b93a9a8444f172a6380f2393d55e52cb4b233262a49764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-mla.lbx \
tex-english-mla.lbx \
tex-italian-mla.lbx \
tex-mla-footnotes.cbx \
tex-mla-new.bbx \
tex-mla-new.cbx \
tex-mla-strict.bbx \
tex-mla-strict.cbx \
tex-mla.bbx \
tex-mla.cbx \
tex-mla7.bbx \
tex-mla7.cbx \
tex-portuguese-mla.lbx \
tex-spanish-mla.lbx \
texlive-biblatex-mla"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
