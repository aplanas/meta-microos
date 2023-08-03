SUMMARY = "Control float placement"
DESCRIPTION = "Defines a \\FloatBarrier command, beyond which floats may not \
pass; useful, for example, to ensure all floats for a section \
appear before the next \\section command."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.2svn19848"

RPM_NAME = "texlive-placeins-2023.209.2.2svn19848-52.1.noarch.rpm"
RPM_HASH = "aad881888b6187427a804c1f3b3109f7789d39043c38581d0e27358878863ccccd2974aa712a2b5cf0a43f3bad2b844ee9e3e48977ec7a99293feaebae8d4120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-placeins.sty \
texlive-placeins"

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
