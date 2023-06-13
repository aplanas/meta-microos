SUMMARY = "TCIA plugin for Orthanc"
DESCRIPTION = "Plugin to import data from The Cancer Image Archive"
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "orthanc-tcia-1.0-1.12.aarch64.rpm"
RPM_HASH = "1d3f1901504d6f1126627ff122f4f2ae66ab78bf47118a58c2df97b7a07abb15b0685131614893dff09417387c39ab35637ab052b119d1ae2418820cae113721"

RPROVIDES:${PN} += "libOrthancTcia.so.1.0()(64bit) \
orthanc-tcia \
orthanc-tcia(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcsv.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libjsoncpp.so.25()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
orthanc"

inherit rpm
