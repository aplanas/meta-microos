SUMMARY = "Alternating pronouns to aid gender-neutral writing"
DESCRIPTION = "The package implements a version of semi-automatic pronoun \
switching for writing gender-neutral (and possibly annoying) \
prose. It has upper- and lowercase versions of switching \
pronouns for all case forms, plus anaphoric versions that \
reflect the current gender choice."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn41359"

RPM_NAME = "texlive-he-she-2023.209.1.3svn41359-54.1.noarch.rpm"
RPM_HASH = "fdf1fb637fecab14417b7f5cb075990466efd3f2feb4808fc9d1f9d2706533c5e1621497a9df4ed3f11cc746ce7339600887b16d8857e72845aa7c433f77acfd"
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
