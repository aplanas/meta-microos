SUMMARY = "A collection of small packages by Walter Schmidt"
DESCRIPTION = "A bundle of packages that arise in the author's area of \
interest: compliance of maths typesetting with ISO standards; \
symbols that work in both maths and text modes commas for both \
decimal separator and maths; and upright Greek letters in \
maths."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64691"

RPM_NAME = "texlive-was-2023.201.svn64691-53.1.noarch.rpm"
RPM_HASH = "19960d5d506f4e6b1fa6999088185e3cca5bd19b58a4a8e61747cbd72189d7e58deee4f3982e340e0f925130147b9c8b0aa0b1a92e79ac87cabedb9d20afeb1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icomma.sty \
tex-upgreek.sty \
texlive-was"

RDEPENDS:${PN} += "/bin/sh \
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
