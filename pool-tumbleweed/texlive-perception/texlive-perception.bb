SUMMARY = "BibTeX style for the journal Perception"
DESCRIPTION = "A product of custom-bib, provided simply to save others' time."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn48861"

RPM_NAME = "texlive-perception-2023.209.svn48861-52.1.noarch.rpm"
RPM_HASH = "d975ce892a572e4aec3e235c051c86b3f6c814fdce8aaaf17fd452bcf260a54079189f0a922488be7d9cb82a607bb0c59c0fedba0e947875f8b5771aa6524f3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-perception"

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
