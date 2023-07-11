SUMMARY = "VolView plugin for Orthanc"
DESCRIPTION = "Plugin to access KitWares VolView viewer from Orthanc \
The homepage of VolView can be found at: \
https://volview.kitware.com/ \
The source code of VolView is available at: \
https://github.com/Kitware/VolView"
LICENSE = "AGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "orthanc-volview-1.1-1.1.aarch64.rpm"
RPM_HASH = "776692aebf9f5129beffeb5bf2a3c3d2839f7f8b681a6285df5f827b20fa51d4ec8dbfa466ce3c07735d54a4f2506b77146961c38ee09f49dea9f877a82e8154"

RPROVIDES:${PN} += "libOrthancVolView.so.1.1 \
orthanc-volview"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libstdc++.so.6 \
libz.so.1 \
orthanc"

inherit rpm
