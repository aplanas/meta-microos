SUMMARY = "Package to display recorder fingering diagrams"
DESCRIPTION = "This package provides support for generating and displaying \
fingering diagrams for baroque fingering recorders. Standard \
fingerings are provided for recorders in both C and F, along \
with methods to create and display alternate fingerings for \
trills, etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn66008"

RPM_NAME = "texlive-recorder-fingering-2023.209.1.1bsvn66008-54.1.noarch.rpm"
RPM_HASH = "faa29adfd4c9e679a122eb5d794aa8afd4659b53f86f4a0cccd5656f62c09042a4c30608c40f711b863d3928960c96e46e95e392eead9bbb2bf26e6560bad3f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-recorder-fingering.sty \
texlive-recorder-fingering"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
