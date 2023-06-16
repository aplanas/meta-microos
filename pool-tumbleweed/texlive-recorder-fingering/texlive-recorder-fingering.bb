SUMMARY = "Package to display recorder fingering diagrams"
DESCRIPTION = "This package provides support for generating and displaying \
fingering diagrams for baroque fingering recorders. Standard \
fingerings are provided for recorders in both C and F, along \
with methods to create and display alternate fingerings for \
trills, etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn66008"

RPM_NAME = "texlive-recorder-fingering-2023.201.1.1bsvn66008-53.1.noarch.rpm"
RPM_HASH = "8ddafb76fbb128f17ea70182eda3f0c654105cfe5cf4833d6de5376af66d262c4002303918421379605281341f3e658770c80defeb4720199c0c0f2e918895b6"
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
