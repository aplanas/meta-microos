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
This package provides the shared libraries for fastjet and its \
plugins."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.0"

RPM_NAME = "libfastjet0-3.4.0-2.9.aarch64.rpm"
RPM_HASH = "e56de37cffd5c94c0c94d1081403c6461d9e149f61e515037eca91ed99669eb23b549020eaec372339b674123f0235b408fb373800424600527f6a33cc83921f"

RPROVIDES:${PN} += "libfastjet.so.0 \
libfastjet0 \
libfastjetplugins.so.0 \
libfastjettools.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsiscone-spherical.so.0 \
libsiscone.so.0 \
libstdc++.so.6"

inherit rpm
