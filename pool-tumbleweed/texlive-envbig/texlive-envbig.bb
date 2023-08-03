SUMMARY = "Printing addresses on envelopes"
DESCRIPTION = "A simple package, that prints both 'from' and 'to' addresses."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-envbig-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "5d46a7a07244e5883c5418ddc07f7a774805d179fd369a936cc88c933e53ec2b9b16d5bacceaea37751a196ec5191799075c92a65dab80bfd12e7403fe82301e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-envbig.sty \
texlive-envbig"

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
