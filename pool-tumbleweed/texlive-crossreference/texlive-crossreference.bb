SUMMARY = "Crossreferences within documents"
DESCRIPTION = "The package defines cross-references (essentially 'grand' label \
references), which may be listed in a table of \
cross-references."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-crossreference-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "a37d8c4003fb4cd95fbb72c0f4b54a007e441e8c8d6c44b2d1e67c7490eecf9e5837d8d2ee707c9ed9ef4cef3d8b3372adbe919b7440f53cbf8a4a669ab06233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crossreference.sty \
texlive-crossreference"

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
