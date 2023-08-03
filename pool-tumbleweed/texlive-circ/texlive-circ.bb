SUMMARY = "Macros for typesetting circuit diagrams"
DESCRIPTION = "Several electrical symbols like resistor, capacitor, \
transistors etc., are defined. The symbols can be connected \
with wires. The package also contains an American resistor \
symbol for those of us on that side of the Atlantic. The \
package also has simple facilities for producing optics \
diagrams; however, no-one would deny that the PSTricks \
pst-optic package, or the MetaPost makecirc package do the job \
better."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn62977"

RPM_NAME = "texlive-circ-2023.209.1.1svn62977-54.1.noarch.rpm"
RPM_HASH = "1ada1ada7e2432a25a8824c7df87dd33c7c8de30f13179aa00932e3409eeadc5acc53374bfafe02ec7e05029d3497ba5b3dd4a94f943ed944cc1424150240049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-basic.def \
tex-box.def \
tex-cioptic.tfm \
tex-circ.sty \
tex-gate.def \
tex-ic.def \
tex-oldgate.def \
tex-optics.def \
tex-physics.def \
texlive-circ"

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
