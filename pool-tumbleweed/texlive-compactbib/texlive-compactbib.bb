SUMMARY = "Multiple thebibliography environments"
DESCRIPTION = "Allows a second bibliography, optionally with a different \
title, after the main bibliography."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-compactbib-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "280425e9605466807b895f5a7257456c3f9950377fe4d09911c62198b7216e6f182158401b653fa03a61e0fd74ab4b7aa0958e2c3fcd86ac0034b36404d16b0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-compactbib.sty \
texlive-compactbib"

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
