SUMMARY = "Bold latin and greek characters through simple prefix characters"
DESCRIPTION = "This package provides bold latin and greek characters within \
\\mathversion{normal}, by using ~ and ' as prefix characters."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-boldtensors-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "29f01789507ae86fbcc9011904f38cb53b5ea95c5f0ac61aabd514c99f8a49e230b52df82fa03c08a2082a104724893f3830c7cb5f47a559a08914d55daff2b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boldtensors.sty \
texlive-boldtensors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
font-bbold \
grep \
sed \
tex-bbold.map \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
