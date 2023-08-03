SUMMARY = "General looping macros for use with LaTeX"
DESCRIPTION = "The package provides efficient looping macros for processing \
both csv (separated-values) and nsv/tsv (non-separated values) \
lists. CSV lists which have associated parsers may be processed \
with the tools of the package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn30704"

RPM_NAME = "texlive-loops-2023.209.1.3svn30704-55.1.noarch.rpm"
RPM_HASH = "1f402ca475d40ffdb9e2729655e07c5b2687b77193697809eb63813caf9e73a372a1b2fc2548c1a809b08b540d80063f1f4646b125db61f25c55f523df88c25b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-loops.sty \
texlive-loops"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-skeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
