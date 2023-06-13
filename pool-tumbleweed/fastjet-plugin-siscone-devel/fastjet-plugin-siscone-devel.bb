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

RPM_NAME = "fastjet-plugin-siscone-devel-3.4.0-2.8.aarch64.rpm"
RPM_HASH = "e0bfee1ae78f03546fd91f112d3ab4dbb60cc40ac14001fc1db49109d06577c3a1503db6d79f91c3913ce707aa27328e9173ee45e4f66815da58830d3ff04d92"

RPROVIDES:${PN} += "fastjet-plugin-siscone-devel \
fastjet-plugin-siscone-devel(aarch-64)"

RDEPENDS:${PN} += "fastjet-devel \
fastjet-plugin-siscone"

inherit rpm
