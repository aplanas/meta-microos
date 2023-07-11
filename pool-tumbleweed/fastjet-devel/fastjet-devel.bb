SUMMARY = "Shared libraries for fastjet core package"
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
This package provides the header files for development with fastjet."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.0"

RPM_NAME = "fastjet-devel-3.4.0-2.9.aarch64.rpm"
RPM_HASH = "3202debe4e61af571aca700c472978702b17e46da0d033aa945a4a19d7cc6d5733144189f93981ba402ae1c7c3198d66f985ec81cca23263f920678c44261c90"

RPROVIDES:${PN} += "fastjet-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
cgal-devel \
libfastjet0"

inherit rpm
