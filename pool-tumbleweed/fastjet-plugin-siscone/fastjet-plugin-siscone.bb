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

RPM_NAME = "fastjet-plugin-siscone-3.4.0-2.9.aarch64.rpm"
RPM_HASH = "627779787783d6b002d1e071dbfd6041ac96d0448ee788f2679acdc7dea9db12a26e3cbf3280e405a49066cece5e680b289279597e4e27273d9901ccef7b6d10"

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
