SUMMARY = "Supporting tools for use with Metafont"
DESCRIPTION = "A collection of programs (as web source) for processing the \
output of Metafont."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-mfware-2023.209.svn66186-55.1.noarch.rpm"
RPM_HASH = "ae9c5c10bc3800373b956ce57f2f97c8d9bdfff81362e134ad0fa79bad44e2fa17c64ee6fafbc1d978deb1a5c504e2cb4836e6e11bf39267717b9b11e5a88d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mfware"

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
texlive-mfware-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
