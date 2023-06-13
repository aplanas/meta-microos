SUMMARY = "Template for a simple presentation"
DESCRIPTION = "This is a simple but nice theme for Beamer. Features: simple \
structure: with page numbers in footer, no side bar, simple \
colors: using only several foreground and background colors."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn60061"

RPM_NAME = "texlive-beamertheme-simpledarkblue-2023.201.svn60061-53.1.noarch.rpm"
RPM_HASH = "53825f7ce6b46e1a9e40d09c7244f9c6587a7d40f7e7ae9eefc039c569151e5274e95f0a9d31c348520f8163cb52d4cae48dc61a9734b862fd8203113bcb3f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemeSimpleDarkBlue.sty) \
tex(beamerfontthemeSimpleDarkBlue.sty) \
tex(beamerthemeSimpleDarkBlue.sty) \
texlive-beamertheme-simpledarkblue"

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
