SUMMARY = "Draw chemical structure diagrams with MetaPost"
DESCRIPTION = "The Molecular Coding Format (MCF) is a linear notation for \
describing chemical structure diagrams. This package converts \
MCF to graphic files using MetaPost."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.92svn65666"

RPM_NAME = "texlive-mcf2graph-2023.201.4.92svn65666-52.1.noarch.rpm"
RPM_HASH = "73cab870e3f44c40da6ef3cb9d4a3d082307b160f1c28d0117714a7f8c0b07888900a7bc5b1a55494c67a51a6013e98cd5b3e81d288df252d688948bcaae5b54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mcf2graph"

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
