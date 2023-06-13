SUMMARY = "Alternating pronouns to aid gender-neutral writing"
DESCRIPTION = "The package implements a version of semi-automatic pronoun \
switching for writing gender-neutral (and possibly annoying) \
prose. It has upper- and lowercase versions of switching \
pronouns for all case forms, plus anaphoric versions that \
reflect the current gender choice."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn41359"

RPM_NAME = "texlive-he-she-2023.201.1.3svn41359-53.1.noarch.rpm"
RPM_HASH = "5c50164c49e1d644d8cb9748b022b26efe46c6dab93c017baa8bdfabf87fd9cde63751483996087544590e27dde9b774d815c0c3e623a4dd00b57aaa7438fefe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(he-she.sty) \
texlive-he-she"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(everyhook.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
