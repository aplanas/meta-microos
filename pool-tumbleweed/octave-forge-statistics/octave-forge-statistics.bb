SUMMARY = "Additional statistics functions for Octave"
DESCRIPTION = "Additional statistics functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & SUSE-Public-Domain"

PV = "1.5.4"

RPM_NAME = "octave-forge-statistics-1.5.4-1.1.aarch64.rpm"
RPM_HASH = "3f0d9577c7fdbe45bf631c98b3d57eda3dfd0c4c67cb124b59fe7d1082cc7a17b3240d1f7e88f36dc908815c887664b22abb93505c4b2f862357ccc904acd91b"

RPROVIDES:${PN} += "octave-forge-statistics"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli"

inherit rpm
