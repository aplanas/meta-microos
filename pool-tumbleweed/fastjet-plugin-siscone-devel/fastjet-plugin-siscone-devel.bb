SUMMARY = "SISCone plugin for fastjet"
DESCRIPTION = "FastJet is a software package for jet finding in pp and e+e- \
collisions. It includes fast native implementations of many sequential \
recombination clustering algorithms, plugins for access to a range of \
cone jet finders and tools for advanced jet manipulation. \
 \
It provides a fast implementation of several \
longitudinally invariant sequential recombination jet algorithms, in \
particular the longitudinally invariant kt jet algorithm, the \
inclusive longitudinally invariant version of the Cambridge/Aachen \
jet-algorithm, and the inclusive anti-kt algorithm. \
 \
This package provides the develoment files for SISCone plugin for \
fastjet."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.0"

RPM_NAME = "fastjet-plugin-siscone-devel-3.4.0-2.9.aarch64.rpm"
RPM_HASH = "953d6aeae22544008f32fbd623506825f2b7b0b1b7098e75ee77b3b3789825eecf6fdae8872f25eff3422a794b1e1e6203925504ea41c754ce140ca4496b380b"

RPROVIDES:${PN} += "fastjet-plugin-siscone-devel"

RDEPENDS:${PN} += "fastjet-devel \
fastjet-plugin-siscone"

inherit rpm
