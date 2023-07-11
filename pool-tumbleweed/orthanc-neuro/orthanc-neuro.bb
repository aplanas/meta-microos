SUMMARY = "Neuroimaging plugin for Orthanc"
DESCRIPTION = "Plugin to import data from The Cancer Image Archive"
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "orthanc-neuro-1.0-1.10.aarch64.rpm"
RPM_HASH = "59426cb4ae88021b2e5408b71e01c35f959324cf8c65ade00ee76b11f3f51f39c979ae0b8ea76e6b1c0e84d7954c5a9fff9168946bd783e95ef0869817f7e1da"

RPROVIDES:${PN} += "libOrthancNeuro.so.1.0 \
orthanc-neuro"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
orthanc"

inherit rpm
