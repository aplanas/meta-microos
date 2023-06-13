SUMMARY = "General looping macros for use with LaTeX"
DESCRIPTION = "The package provides efficient looping macros for processing \
both csv (separated-values) and nsv/tsv (non-separated values) \
lists. CSV lists which have associated parsers may be processed \
with the tools of the package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn30704"

RPM_NAME = "texlive-loops-2023.201.1.3svn30704-54.1.noarch.rpm"
RPM_HASH = "6fce6bff057b9aa19c4c5de59391edb860d27d23dc6766dfdbb86e62fd5bcaca967f82e0b08e8ea8ad9c7751ec855c97681716bf06c900b89220f38b5a0d88a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(loops.sty) \
texlive-loops"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(skeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
