SUMMARY = "TCIA plugin for Orthanc"
DESCRIPTION = "Plugin to import data from The Cancer Image Archive"
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "orthanc-tcia-1.0-1.13.aarch64.rpm"
RPM_HASH = "4048644167e2c6896c62e9503b9e28ce62813f93d5d0012a80c9c0fcc524b4276b97c51e25968d60aa9942e53fc652a99912cdc0e348b1e153feebc00b74a355"

RPROVIDES:${PN} += "libOrthancTcia.so.1.0 \
orthanc-tcia"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcsv.so.3 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libsqlite3.so.0 \
libstdc++.so.6 \
orthanc"

inherit rpm
