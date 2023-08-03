SUMMARY = "A TikZ library for creating track diagrams in railways"
DESCRIPTION = "This TikZ library is a toolbox of symbols geared primarily \
towards creating track schematic for either research or \
educational purposes. It provides a TikZ frontend to some of \
the symbols which may be needed to describe situations and \
layouts in railway operation. The library is divided into \
sublibraries: topology, trafficcontrol, vehicles, \
constructions, electrics, symbology, and measures."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.1svn63480"

RPM_NAME = "texlive-tikz-trackschematic-2023.209.0.0.7.1svn63480-53.1.noarch.rpm"
RPM_HASH = "6e0c31858e7c268518289bc3296b99a15e0eb6b2eae5939dcd5a19bc44cfd00763d4f3d535221ae966c77278cbea70176b35747c1f5875481d6cb05c3cccd8ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-trackschematic.sty \
tex-tikzlibrarytrackschematic.code.tex \
tex-tikzlibrarytrackschematic.constructions.code.tex \
tex-tikzlibrarytrackschematic.electrics.code.tex \
tex-tikzlibrarytrackschematic.measures.code.tex \
tex-tikzlibrarytrackschematic.symbology.code.tex \
tex-tikzlibrarytrackschematic.topology.code.tex \
tex-tikzlibrarytrackschematic.trafficcontrol.code.tex \
tex-tikzlibrarytrackschematic.vehicles.code.tex \
texlive-tikz-trackschematic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
