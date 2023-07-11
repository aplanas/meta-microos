SUMMARY = "Draw chemical structure diagrams with MetaPost"
DESCRIPTION = "The Molecular Coding Format (MCF) is a linear notation for \
describing chemical structure diagrams. This package converts \
MCF to graphic files using MetaPost."
LICENSE = "LPPL-1.0"

PV = "2023.208.4.92svn65666"

RPM_NAME = "texlive-mcf2graph-2023.208.4.92svn65666-53.1.noarch.rpm"
RPM_HASH = "d7ee8fbbfeec85adc42326564121c29b8914961f3f55b5f78b010e334a8f3c38259b20ca2310cf37c8b1a16280bbd106f16de570b09253e2ffde701e37fef623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mcf2graph"

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
