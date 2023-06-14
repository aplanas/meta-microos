SUMMARY = "Neuroimaging plugin for Orthanc"
DESCRIPTION = "Plugin to import data from The Cancer Image Archive"
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "orthanc-neuro-1.0-1.9.aarch64.rpm"
RPM_HASH = "17a8fd397adf28fa6a9525ae677732df883f68138849e6fbdc5d7331273bd4dbffa7830428bbed0054613e7fc5f61336e3766bb005ae6a6cdf8674280e158211"

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
