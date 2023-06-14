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
This package provides shared libraries for SISCone plugin for \
fastjet."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.0"

RPM_NAME = "fastjet-plugin-siscone-3.4.0-2.8.aarch64.rpm"
RPM_HASH = "1e9dedd0bfaafad0984f4f653b348c3a843f8be8f91af7131fcb765a6612591249c1ea34eafb9df2d87b767390252b9b3dcdc376384b121173f58999f967a6a5"

RPROVIDES:${PN} += "fastjet-plugin-siscone \
libsiscone-spherical.so.0 \
libsiscone.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
