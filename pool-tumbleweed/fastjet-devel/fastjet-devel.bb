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

RPM_NAME = "fastjet-devel-3.4.0-2.8.aarch64.rpm"
RPM_HASH = "a12f1d38abd43e90d807ac927c4f936f129138d3ffd36b5733def91e27fa0fb55d13a140a3109dd2cca16ae17a5071f861f3ed8239b6b1bcc4258cf666a7391f"

RPROVIDES:${PN} += "fastjet-devel"

RDEPENDS:${PN} += "/bin/bash \
cgal-devel \
libfastjet0"

inherit rpm
