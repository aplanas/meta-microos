SUMMARY = "Template for a simple presentation"
DESCRIPTION = "This is a simple but nice theme for Beamer. Features: simple \
structure: with page numbers in footer, no side bar, simple \
colors: using only several foreground and background colors."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn60061"

RPM_NAME = "texlive-beamertheme-simpledarkblue-2023.209.svn60061-54.1.noarch.rpm"
RPM_HASH = "9908914876510a891a85ff6bff9987875da2be540df9f17c68c04af66585c0ab505cfe482193cecdc195635c05d134368930d31d172d3c3af56c746b56ed4e8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeSimpleDarkBlue.sty \
tex-beamerfontthemeSimpleDarkBlue.sty \
tex-beamerthemeSimpleDarkBlue.sty \
texlive-beamertheme-simpledarkblue"

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
