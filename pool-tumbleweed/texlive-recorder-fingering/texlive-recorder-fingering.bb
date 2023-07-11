SUMMARY = "Package to display recorder fingering diagrams"
DESCRIPTION = "This package provides support for generating and displaying \
fingering diagrams for baroque fingering recorders. Standard \
fingerings are provided for recorders in both C and F, along \
with methods to create and display alternate fingerings for \
trills, etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn66008"

RPM_NAME = "texlive-recorder-fingering-2023.201.1.1bsvn66008-53.2.noarch.rpm"
RPM_HASH = "9fd47a1eba0fe3db1f3cd647f61a4982668bedc5d287c9ebd7189d796473cee48d98d19773ab98b62db2a1f306576472ee3de7e6755f8000e3c02f2f032f84c5"
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
