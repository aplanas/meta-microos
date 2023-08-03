SUMMARY = "Notes after every paragraph (or elsewhere)"
DESCRIPTION = "The package provides the \\parnote command. The notes are set as \
(normal) running paragraphs; placement is at the end of each \
paragraph, or manually, using the \\parnotes command."
LICENSE = "LPPL-1.0"

PV = "2023.209.3bsvn51720"

RPM_NAME = "texlive-parnotes-2023.209.3bsvn51720-52.1.noarch.rpm"
RPM_HASH = "86f1d276219113abceaed12beec76f9bbea5a2f301432b5607eb689e2f264b097b165749a3bee75d2b1e864fdee8d003d332947886442fb3d71cf8ce134c9c3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-parnotes.sty \
texlive-parnotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
