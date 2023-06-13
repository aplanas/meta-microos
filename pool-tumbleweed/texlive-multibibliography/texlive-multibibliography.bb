SUMMARY = "Multiple versions of a bibliography, with different sort orders"
DESCRIPTION = "Conventional standards for bibliography styles impose a forced \
choice between index and name/year citations, and corresponding \
references. The package avoids this choice, by providing \
alphabetic, sequenced, and even chronological orderings of \
references. Inline citations, that integrate these \
heterogeneous styles, are also supported (and work with other \
bibliography packages)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn30939"

RPM_NAME = "texlive-multibibliography-2023.201.1.03svn30939-54.1.noarch.rpm"
RPM_HASH = "20271bcc17beec1ee6bbeef8ef61731d12e6b2595acf343dfbfe4ec5525c48b871440110d090fa0b43d4e6345894e65921f0419d837e4e371405a6243da6f6b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(multibibliography.sty) \
texlive-multibibliography"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(strict) \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-multibibliography-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
