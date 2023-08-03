SUMMARY = "Fonts for typesetting Ogham script"
DESCRIPTION = "The font provides the Ogham alphabet, which is found on a \
number of Irish and Pictish carvings dating from the 4th \
century AD. The font is distributed as Metafont source, which \
has been patched (with the author's permission) for stability \
at different output device resolutions. (Thanks are due to \
Peter Flynn and Dan Luecking.)"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn24876"

RPM_NAME = "texlive-ogham-2023.209.svn24876-55.1.noarch.rpm"
RPM_HASH = "e8c9dfd288e73e4220ab336fdc1eeaf8b471c62bf64fed876b8bd4eeea124d8b79759bfb2504b53e736e3dd1d62005b8f8ceeaeea88ba7baea2ab848bb1fe3cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ogham.tfm \
texlive-ogham"

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
