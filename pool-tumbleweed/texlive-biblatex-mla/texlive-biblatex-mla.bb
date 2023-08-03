SUMMARY = "MLA style files for BibLaTeX"
DESCRIPTION = "The package provides BibLaTeX support for citations in the \
format specified by the MLA handbook."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1asvn62138"

RPM_NAME = "texlive-biblatex-mla-2023.209.2.1asvn62138-54.1.noarch.rpm"
RPM_HASH = "9a5c53664201b9199305eb1c7e9714bf47542bf0996e7b30f17e9ed04af6763165b475f6a2030a7f6728572a901466ddf2eb41a1a598b78f03dbbedc09b94f81"
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
