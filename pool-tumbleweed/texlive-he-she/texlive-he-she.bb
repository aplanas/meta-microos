SUMMARY = "Alternating pronouns to aid gender-neutral writing"
DESCRIPTION = "The package implements a version of semi-automatic pronoun \
switching for writing gender-neutral (and possibly annoying) \
prose. It has upper- and lowercase versions of switching \
pronouns for all case forms, plus anaphoric versions that \
reflect the current gender choice."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn41359"

RPM_NAME = "texlive-he-she-2023.201.1.3svn41359-53.2.noarch.rpm"
RPM_HASH = "70483b044608736e4380d8081184ba9c7597827dccf9ac0bec4adc21e834cb64184db6ec0255196f056f2da379b355b8a1e8e350bde964b17be994e0752d4979"
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
